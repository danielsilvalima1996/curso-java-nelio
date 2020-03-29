package aula52;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			double numerador = sc.nextDouble();
			double denominador = sc.nextDouble();

			System.out.println((denominador == 0) ? "Divisão Impossível" : numerador / denominador);

		}

		sc.close();

	}

}
