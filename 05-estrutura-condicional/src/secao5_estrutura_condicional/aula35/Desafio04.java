package secao5_estrutura_condicional.aula35;

import java.util.Scanner;

public class Desafio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Horário Inicial do jogo: ");
		int horaInicial = sc.nextInt();

		System.out.print("Horário Final do jogo: ");
		int horaFinal = sc.nextInt();

		int totalHoras;

		if (horaInicial > horaFinal) {
			totalHoras = (horaFinal + 24) - horaInicial;
		} else if (horaInicial == horaFinal) {
			totalHoras = 24;
		} else {
			totalHoras = horaFinal - horaInicial;
		}

		System.out.println("O jogo durou " + totalHoras + " HORA(S)");

		sc.close();

	}

}
