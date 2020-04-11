package aula69;

import java.util.Scanner;

public class Aula69Versao01 {

	public static final double PI = 3.14159;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o Raio: ");

		double raio = sc.nextDouble();

		double c = circunferencia(raio);

		double v = volume(raio);

		System.out.printf("Circuferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor PI: %.2f%n", PI);

		sc.close();

	}

	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}

	public static double volume(double raio) {
		return 4 * PI * Math.pow(raio, 3) / 3;
	}

}
