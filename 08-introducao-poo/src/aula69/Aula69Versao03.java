package aula69;

import java.util.Scanner;

public class Aula69Versao03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o Raio: ");

		double raio = sc.nextDouble();

		double c = CalculadoraV2.circunferencia(raio);

		double v = CalculadoraV2.volume(raio);

		System.out.printf("Circuferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor PI: %.2f%n", CalculadoraV2.PI);

		sc.close();

	}

}
