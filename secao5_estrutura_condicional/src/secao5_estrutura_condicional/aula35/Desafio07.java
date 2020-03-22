package secao5_estrutura_condicional.aula35;

import java.util.Scanner;

public class Desafio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o valor de X: ");
		float x = sc.nextFloat();
		System.out.print("Digite o valor de Y: ");
		float y = sc.nextFloat();
		String saida;

		if (x > 0 && y > 0) {
			saida = "Q1";
		} else if (x > 0 && y < 0) {
			saida = "Q4";
		} else if (x < 0 && y > 0) {
			saida = "Q2";
		} else if (x < 0 && y < 0) {
			saida = "Q3";
		} else {
			saida = "Origem";
		}

		System.out.println(saida);

		sc.close();
	}

}
