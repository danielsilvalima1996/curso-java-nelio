package aula89;

import java.util.Scanner;

public class Desafio89 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Deseja alugar quantos quartos: ");
		int qtdI = sc.nextInt();

		Inquilinos[] vect = new Inquilinos[10];

		for (int i = 0; i < qtdI; i++) {
			sc.nextLine();
			System.out.println("Inquilo#" + (i + 1));
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Inquilinos(nome, email);

		}

		System.out.println("Quartos ocupados: ");

		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println(i + ": " + vect[i].getNome() + ", " + vect[i].getEmail());
			}
		}

		sc.close();

	}

}
