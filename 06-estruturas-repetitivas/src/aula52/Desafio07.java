package aula52;

import java.util.Scanner;

public class Desafio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			double qua = Math.pow(i, 2);
			double cubo = Math.pow(i, 3);
			System.out.printf("%d %.0f %.0f%n", i, qua, cubo);
		}

		sc.close();

	}

}
