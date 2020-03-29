package aula52;

import java.util.Scanner;

public class Desafio06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			if (n % 2 == 0) {
				System.out.println(n / i);
			}
		}

		sc.close();

	}

}
