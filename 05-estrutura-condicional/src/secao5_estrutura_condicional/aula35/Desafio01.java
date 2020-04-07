package secao5_estrutura_condicional.aula35;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número: ");
		int numero = sc.nextInt();

		if (numero < 0) {
			System.out.println("O número " + numero + " é NEGATIVO!");
		} else {
			System.out.println("O número " + numero + " é POSITIVO!");
		}
		
		sc.close();

	}

}
