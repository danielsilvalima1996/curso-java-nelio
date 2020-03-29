package aula52;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int fatorial = 1;

		for (int i = n; i > 1; i--) {
			if (n == 0) {
				fatorial = 1;
			} else {
				fatorial *= i;
			}
		}
		
		System.out.print(fatorial);

		sc.close();

	}

}
