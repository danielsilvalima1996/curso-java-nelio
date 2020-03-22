package secao5_estrutura_condicional.aula35;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		int a = sc.nextInt();

		System.out.print("Digite o segundo número: ");
		int b = sc.nextInt();
		int res;
		if (a > b) {
			res = a % b;
		} else {
			res = b % a;
		}
		System.out.println("Os números " + a + " e " + b + (res == 0 ? " SÃO " : " NÃO SÃO ") + "MULTIPLOS!");

		sc.close();

	}

}
