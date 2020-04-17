package aula80;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ContaBanco cb;
		
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();
		
		System.out.print("Digite o nome da conta: ");
		String nome = sc.nextLine();
		
		System.out.print("Deseja fazer um deposito inicial (y/n)? ");
		char respInicial = sc.nextLine().charAt(0);
		
		if (respInicial == 'y') {
			System.out.print("Digite o valor do deposito R$: ");
			double saldo = sc.nextDouble();
			cb = new ContaBanco(nome, numero, saldo);
		} else {
			cb = new ContaBanco(nome, numero);
		}
		
		System.out.println("\nDados conta: \n" + cb);
		
		System.out.print("\nValor deposito R$: ");
		double valor = sc.nextDouble();
		cb.deposito(valor);
		
		System.out.println("Dados da conta atualizados: " + cb);
		
		System.out.print("\nValor do saque R$: ");
		valor = sc.nextDouble();
		cb.saque(valor);
		
		System.out.println("Dados da conta atualizados: " + cb);
		
		sc.close();

	}

}
