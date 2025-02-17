import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enumEntities.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {
        Scanner leitor = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy"); // Máscara para datas

        System.out.println("Enter Cliente data");

        System.out.print("Name:");
        String name = leitor.nextLine();

        System.out.print("Email: ");
        String email = leitor.next();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDay = simpleDateFormat.parse(leitor.next());

        Client client = new Client(name, email, birthDay);

        System.out.println("Enter order data: ");

        System.out.print("Status: ");
        String statusOrder = leitor.next();

        System.out.print("How many items to this order? ");
        int n = leitor.nextInt();

        Date now = new Date();
        Order order = new Order(now, OrderStatus.valueOf(statusOrder), client);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i+1) + "item data:" );

            System.out.print("Product name: ");
            leitor.nextLine();
            String productname = leitor.nextLine();

            System.out.print("Product price: ");
            double productprice = leitor.nextDouble();

            System.out.print("Quantity:");
            int quantity = leitor.nextInt();

            order.AddItems(new OrderItem(quantity,productprice,new Product(productname,productprice)));

        }
        System.out.println();
        System.out.println("Order Sumary: ");
        System.out.println(order);

        leitor.close();
    }
}