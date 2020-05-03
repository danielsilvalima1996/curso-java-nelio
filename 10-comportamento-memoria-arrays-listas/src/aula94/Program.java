package aula94;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		List<Empregado> list = new ArrayList<>();
		
		System.out.print("Quantos funcionários vão ser cadastrados? ");
		
		int numeroCad = sc.nextInt();
		
		for (int i = 1; i <= numeroCad; i++) {
			System.out.println();
			System.out.println("Empregado #" + i + ": ");
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.print("Id já cadastrado. Tente novamente: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			
			list.add(new Empregado(id, name, salario));
		}
		
		System.out.println("");
		System.out.print("Digite o Id do Funciońario para aumentar o salário: ");
		int id = sc.nextInt();
		
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp != null) {
			System.out.print("Digite a porcentagem do aumento: ");
			double aumento = sc.nextDouble();
			emp.aumentaSalario(aumento);
		} else {
			System.out.println("Esse Id não existe!");
		}
		
		System.out.println("Lista de empregados: ");
		
		for(Empregado empregado: list) {
			System.out.println(empregado);
		}
		
		sc.close();

	}
	
	public static boolean hasId(List<Empregado> list, int id) {
		Empregado emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
