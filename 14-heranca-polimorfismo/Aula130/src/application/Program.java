package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> list = new ArrayList<>();
		
		System.out.print("Digite o número de contribuintes: ");
		int numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			System.out.println("Dados do contribuinte #" + i + ": ");
			System.out.print("Individual ou Companhia (i/c): ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if (tipo == 'i') {
				System.out.print("Gastos com a saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			} else {
				System.out.print("Número de Funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}
		}
		
		System.out.println();
		
		double soma = 0;
		
		System.out.println("IMPOSTOS PAGOS: ");
		for (Pessoa p : list) {
			soma += p.calcularImpostos();
			System.out.printf("%s: %.2f%n", p.getNome(), p.calcularImpostos());
		}
		
		System.out.printf("TOTAL DE IMPOSTOS: $ %.2f", soma);
		
		sc.close();

	}

}
