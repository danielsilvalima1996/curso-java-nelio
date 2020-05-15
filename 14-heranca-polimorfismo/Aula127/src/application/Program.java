package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Scanner sc = new Scanner(System.in);

		List<Product> list = new ArrayList<>();

		System.out.print("Digite o número de produtos: ");
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			System.out.println("Dados do produto #" + i + ": ");

			System.out.print("Comum, usado ou importado (c/u/i)? ");
			char tipo = sc.next().charAt(0);

			System.out.print("Nome: ");
			String name = sc.next();

			System.out.print("Preço: ");
			double price = sc.nextDouble();

			if (tipo == 'i') {
				System.out.print("Taxa customização: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			} else if (tipo == 'u') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, date));
			} else {
				list.add(new Product(name, price));
			}
			
			System.out.println("ETIQUETAS DE PREÇO: ");
			
		}
		
		for(Product p : list) {
			System.out.println(p.priceTag());
		}

		sc.close();

	}

}
