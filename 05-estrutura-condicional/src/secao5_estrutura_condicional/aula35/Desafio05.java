package secao5_estrutura_condicional.aula35;

import java.util.Scanner;

public class Desafio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o código do produto: ");
		int codigo = sc.nextInt();

		System.out.print("Quantidade: ");
		int quantidade = sc.nextInt();
		float total;

		if (codigo == 1) {
			total = 4 * quantidade;
		} else if (codigo == 2) {
			total = 4.5f * quantidade;
		} else if (codigo == 3) {
			total = 5 * quantidade;
		} else if (codigo == 4) {
			total = 2 * quantidade;
		} else {
			total = 1.5f * quantidade;
		}
		System.out.printf("Total: R$ %.2f", total);

		sc.close();

	}

}
