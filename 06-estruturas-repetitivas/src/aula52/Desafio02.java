package aula52;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Deseja digitar quantos valores: ");
		int x = sc.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < x; i++) {
			int valor = sc.nextInt();
			if (valor >= 10 && valor <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " IN");
		System.out.println(out + " OUT");

		sc.close();

	}

}
