package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite os dados da conta: ");
			System.out.print("Número: ");
			int number = sc.nextInt();
			System.out.print("Titular da conta: ");
			String holder = sc.next();
			sc.nextLine();
			System.out.print("Saldo inicial: ");
			double balance = sc.nextDouble();
			System.out.print("Limite para saque: ");
			double withdraw = sc.nextDouble();
			Account acc = new Account(number, holder, balance, withdraw);
			System.out.println();
			System.out.print("Digite o valor do saque: ");
			acc.withdraw(sc.nextDouble());
			System.out.printf("Novo saldo: %.2f", acc.getBalance());
		} catch (DomainException e) {
			System.out.println("Erro no saque: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Outros erros: " + e.getMessage());
		}

		sc.close();

	}

}
