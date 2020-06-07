package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Prestacao;
import model.services.ContratoService;
import model.services.ProcessamentoService;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite os dados do contrato!");
		System.out.print("Número do contrato: ");
		int numero = sc.nextInt();
		
		System.out.print("Data (dd/MM/yyyy): ");
		Date data = sdf.parse(sc.next());
		
		System.out.print("Valor do contrato: ");
		double valorTotal = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valorTotal);
		
		System.out.print("Digite o número de parcelas: ");
		int parcelas = sc.nextInt();
		
		ContratoService contratoService = new ContratoService(new ProcessamentoService());
		
		contratoService.processarContrato(contrato, parcelas);
		
		System.out.println("Parcelas: ");
		for (Prestacao c : contrato.getPrestacoes()) {
			System.out.println(c);
		}
		
		
		sc.close();		

	}

}
