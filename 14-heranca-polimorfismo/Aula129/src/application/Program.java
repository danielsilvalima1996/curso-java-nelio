package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Shape> list = new ArrayList<>();

		System.out.print("Digite o número de formas: ");
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {
			System.out.println("Dados da forma #" + i + ": ");
			System.out.print("Retângulo ou Circulo (r/c)? ");
			char tipo = sc.next().charAt(0);
			System.out.print("Cor (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			if (tipo == 'r') {
				System.out.print("Largura: ");
				double width = sc.nextDouble();
				System.out.print("Altura: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			} else {
				System.out.print("Raio: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}

		System.out.println();
		System.out.println("Área das formas: ");

		for (Shape s : list) {
			System.out.printf("%.2f%n", s.area());
		}

		sc.close();

	}

}
