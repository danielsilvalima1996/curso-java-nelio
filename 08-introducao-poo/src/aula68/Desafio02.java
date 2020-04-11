package aula68;

import java.util.Scanner;

public class Desafio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Funcionario func = new Funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		
		System.out.print("Salário Bruto: ");
		func.salarioBruto = sc.nextDouble();
		
		System.out.print("Taxa: ");
		func.taxa = sc.nextDouble();
		
		System.out.println();
		
		System.out.println("Funcionário: " + func);
		
		System.out.println();
		
		System.out.print("Porcentagem de aumento para o salário: ");
		func.incrementoSalario(sc.nextDouble());
		System.out.println();
		
		System.out.println("Dados atualizados: " + func);
		
		
		sc.close();
	}

}
