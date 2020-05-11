package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		System.out.println("Dados do cliente: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de aniversário (DD/MM/YYYY): ");
		Date birthDate = sdf2.parse(sc.nextLine());

		Client client = new Client(name, email, birthDate);

		System.out.println("Dados do Pedido");
		System.out.print("Status: ");
		String orderStatus = sc.nextLine();
		OrderStatus os = OrderStatus.valueOf(orderStatus);
		Date moment = new Date();

		Order order = new Order(moment, os, client);

		System.out.print("Quantos itens tem esse pedido? ");
		int itensPedidos = sc.nextInt();

		for (int i = 1; i <= itensPedidos; i++) {
			System.out.println("Digite os dados do " + i + "#:");
			System.out.print("Nome do produto: ");
			String nameP = sc.next();
			System.out.print("Preço do produto: ");
			double price = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantity = sc.nextInt();

			Product product = new Product(nameP, price);

			OrderItem orderItem = new OrderItem(quantity, price, product);
			order.addItem(orderItem);
		}

		System.out.println();
		System.out.println("Resumo do Pedido: ");
		System.out.println("Momento do Pedido: " + sdf.format(moment));
		System.out.println("Status do Pedido: " + order.getStatus());
		System.out.println("Cliente: " + client);
		System.out.println("Itens do Pedido: ");
		for (OrderItem oi : order.getItems()) {
			System.out.println(oi);
		}
		System.out.printf("Total price: $ %.2f", order.total());

		sc.close();

	}

}
