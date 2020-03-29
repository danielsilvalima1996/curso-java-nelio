package aula52;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número de 1 a 1000: ");
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if (x == 1 || i % 2 == 1) {
				System.out.println(i);
			}
		}

		sc.close();

	}

}
