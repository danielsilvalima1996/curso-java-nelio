package aula76;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();

		System.out.print("Preço: ");
		double price = sc.nextDouble();
		
		Product produto = new Product(name, price);

		System.out.println("Dados do Produto: " + produto.toString());
		System.out.println("");

		System.out.print("Digite o número de produtos para adicionar ao estoque: ");
		int quantity = sc.nextInt();
		System.out.println("");
		produto.addProducts(quantity);

		System.out.println("Dados atualizados Produto: " + produto.toString());
		System.out.println("");

		System.out.print("Digite o número de produtos para remover do estoque: ");
		quantity = sc.nextInt();
		produto.removeProducts(quantity);
		System.out.println("");

		System.out.printf("Dados atualizados Produto: " + produto.toString());

		sc.close();
	}

}
