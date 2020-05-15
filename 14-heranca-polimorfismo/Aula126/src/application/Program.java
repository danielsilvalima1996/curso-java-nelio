package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("Digite o número de empregados: ");
		int numero = sc.nextInt();

		for (int i = 1; i <= numero; i++) {

			System.out.println("Dados do Empregado #" + i + ": ");
			System.out.print("Terceirizado (s/n)? ");
			char terceirizado = sc.next().charAt(0);

			System.out.print("Nome: ");
			String name = sc.next();

			System.out.print("Horas: ");
			int hours = sc.nextInt();

			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();

			if (terceirizado == 's') {
				System.out.print("Valor adicional: ");
				double additionalCharge = sc.nextDouble();
				list.add(new OutsourceEmployee(name, hours, valuePerHour, additionalCharge));
			} else {
				list.add(new Employee(name, hours, valuePerHour));
			}

		}
		System.out.println();
		System.out.println("PAGAMENTOS: ");

		for (Employee emp : list) {
			System.out.println(emp);
		}

		sc.close();

	}

}
