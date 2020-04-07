package secao5_estrutura_condicional.aula35;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = sc.nextInt();
		System.out.println("O número " + numero + " é " + (numero % 2 == 0 ? "PAR" : "IMPAR") + "!");

		sc.close();

	}

}
