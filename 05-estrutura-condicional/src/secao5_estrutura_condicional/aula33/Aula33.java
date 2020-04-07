package secao5_estrutura_condicional.aula33;

import java.util.Scanner;

public class Aula33 {

	public static void main(String[] args) {

		/*
		 * exemplo 1 int x = 5;
		 * 
		 * System.out.println("Bom dia");
		 * 
		 * if (x < 0) { System.out.println("Boa tarde"); }
		 * 
		 * System.out.println("Boa noite");
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantas horas?");
		int hora = sc.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde!");
		} else {
			System.out.println("Boa noite!");
		}
		sc.close();
	}

}
