package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Digite o nome do departamento: ");
		String departamento = sc.nextLine();

		System.out.println("Dados do trabalhador: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();

		System.out.print("Nível: ");
		String level = sc.nextLine();

		System.out.print("Salário base: ");
		double salario = sc.nextDouble();

		Worker worker = new Worker(name, WorkerLevel.valueOf(level), salario, new Departament(departamento));

		System.out.print("Quantos contratos tem o trabalhador? ");
		int numerosContratos = sc.nextInt();

		for (int i = 1; i <= numerosContratos; i++) {
			System.out.println("Dados do contrato #" + i + ":");
			System.out.print("Data (DD/MM/YYYY): ");
			Date data = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valor = sc.nextDouble();
			System.out.print("Duração (Horas): ");
			int duracao = sc.nextInt();
			HourContract contract = new HourContract(data, valor, duracao);
			worker.addContract(contract);
		}
		System.out.println();
		System.out.print("Digite mês e ano para calcular o valor total do salário (MM/YYYY): ");
		String anoMes = sc.next();
		int mes = Integer.parseInt(anoMes.substring(0, 2));
		int ano = Integer.parseInt(anoMes.substring(3));
		
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartament().getName());
		System.out.println("Valor total do " + anoMes + ": " + String.format("%.2f", worker.income(ano, mes)));

		sc.close();

	}

}
