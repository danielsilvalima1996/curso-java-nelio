package aula69;

import java.util.Scanner;

public class Aula69Versao02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CalculadoraV1 calc = new CalculadoraV1();
		
		System.out.print("Digite o Raio: ");

		double raio = sc.nextDouble();

		double c = calc.circunferencia(raio);

		double v = calc.volume(raio);

		System.out.printf("Circuferência: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Valor PI: %.2f%n", calc.PI);

		sc.close();

	}

}
