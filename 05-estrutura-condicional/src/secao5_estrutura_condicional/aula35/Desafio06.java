package secao5_estrutura_condicional.aula35;

import java.util.Scanner;

public class Desafio06 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		float numero = sc.nextFloat();
		String mensagem;
		
		if (numero >= 0 && numero <= 25.00) {
			mensagem = "Intervalo [0, 25]";
		} else if (numero > 25 && numero <= 50.00) {
			mensagem = "Intervalo [25, 50]";
		} else if (numero > 50 && numero <= 75.00) {
			mensagem = "Intervalo [50, 75]";
		} else if (numero > 75 && numero <= 100.00) {
			mensagem = "Intervalo [75, 100]";
		} else {
			mensagem = "Fora de Intervalo";
		}
		
		System.out.print(mensagem);
		
		sc.close();
		
	}

}
