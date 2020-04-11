package aula68;

import java.util.Scanner;

public class Desafio03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Digite o nome do Aluno(a): ");
		aluno.nome = sc.nextLine();
		System.out.println("Digite as notas dos três primeiros semestres: ");
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.n3 = sc.nextDouble();
		
		System.out.printf("Nota final: %.2f%n", aluno.calcularMedia());
		
		if(aluno.calcularMedia() < 60) {
			System.out.printf("REPROVADO!%n" + "PONTOS FALTANTES: %.2f", aluno.pontosFaltantes());
		} else {
			System.out.println("APROVADO!");
		}
		sc.close();

	}

}
