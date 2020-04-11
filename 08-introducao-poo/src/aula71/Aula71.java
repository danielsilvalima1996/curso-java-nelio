package aula71;

import java.util.Scanner;

public class Aula71 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		ConversorMoeda cm = new ConversorMoeda();
		
		System.out.print("Qual é o preço do dolar R$: ");
		cm.valorDolar = sc.nextDouble();
		System.out.print("Quantos dolares irá comprar $: ");
		cm.qtdDolar = sc.nextDouble();
		
		System.out.printf("O valor a ser pago em reais é R$ %.2f", cm.converterDolar());
		
		sc.close();
		
	}

}
