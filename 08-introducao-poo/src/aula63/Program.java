package aula63;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Triangulo x, y;

		x = new Triangulo();
		y = new Triangulo();

		System.out.println("Digite os lados do triangulo X: ");

		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();

		System.out.println("Digite os lados do triangula Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.area();

		double areaY = y.area();

		System.out.printf("Área do triangulo X: %.4f%n", areaX);

		System.out.printf("Área do triangulo Y: %.4f%n", areaY);

		if (areaX > areaY) {
			System.out.println("Área mais larga: X");
		} else {
			System.out.println("Área mais larga: Y");
		}

		sc.close();

	}

}
