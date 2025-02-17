# Gerenciador-De-Pedidos
Introdução

Este projeto consiste em um sistema de gerenciamento de pedidos que permite registrar clientes, produtos e pedidos realizados. O programa captura informações sobre o cliente, como nome, e-mail e data de nascimento, e possibilita a inserção de produtos em um pedido com respectivas quantidades e preços. Ao final, é gerado um resumo do pedido com os itens adquiridos e o valor total.

Tecnologias Utilizadas

O projeto foi desenvolvido utilizando a linguagem de programação Java e faz uso das seguintes tecnologias e recursos:

Java Standard Edition (JSE): Para a lógica do programa e manipulação de classes e objetos.
Collections API (List, ArrayList): Para armazenar e manipular os itens do pedido.
Scanner: Para entrada de dados pelo usuário.
SimpleDateFormat: Para formatação e manipulação de datas.
Enum: Para definir os status dos pedidos de forma estruturada.

Resumo do Projeto

O sistema funciona da seguinte maneira:
O usuário é solicitado a inserir os dados do cliente (nome, e-mail e data de nascimento).
Em seguida, é feita a captura das informações do pedido:
Status do pedido.

Quantidade de itens no pedido.

Para cada item do pedido, o usuário deve inserir:

Nome do produto.

Preço do produto.

Quantidade desejada.

O pedido é armazenado junto com os dados do cliente e os itens comprados.

Por fim, é gerado um resumo do pedido, exibindo:

Cliente associado ao pedido.

Data e status do pedido.

Lista de produtos adquiridos com suas quantidades e valores unitários.

Valor total do pedido.

A implementação segue os princípios da programação orientada a objetos, com classes para representar entidades do sistema, como Client, Order, OrderItem e Product, além de uma enumeração OrderStatus para gerenciar os diferentes estados do pedido.
