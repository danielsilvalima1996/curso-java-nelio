package secao5_estrutura_condicional.aula35;

import java.util.Scanner;

public class Desafio08 {

	public static void main(String[] args) {
		
		/**
		 * salario = 4500
		 * 4500 - 2000 = 2500
		 * 8 * 1000, restante 1500 * 18
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor do seu salário R$: ");
		float salario = sc.nextFloat();
		float desconto = 0;
		
		if (salario <= 2000.00) {
			desconto = 0;
		} else if (salario <= 3000) {
			desconto = (salario - 2000) * 8 / 100;
		} else if (salario <= 4500) {
			salario = salario - 2000;
			desconto = (999.99f * 8 / 100) + (salario - 999.99f) * 18 / 100;
		} else {
			salario = salario - 2000;
			desconto = (999.99f * 8 / 100) + (1499.99f * 18 / 100) + ((salario - 999.99f - 1499.99f) * 28 / 100);
		}
		
		if (desconto > 0) {
			System.out.printf("R$ %.2f", desconto);
		} else {
			 System.out.print("Isento");
		}
		
		sc.close();
		
	}

}
