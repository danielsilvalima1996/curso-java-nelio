package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.CalculationService;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<Product>();

		String path = "/home/daniel/Documentos/curso-java-nelio/19-generics-set-map/aula203/src/in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] vect = line.split(",");
				list.add(new Product(vect[0], Double.parseDouble(vect[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Max: ");
			System.out.println(x);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
