package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;


public class Program {
	
	public static void main(String[] args) throws ParseException {
		
//		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		System.out.println("Digite os dados do aluguel");
		
		System.out.print("Modelo do carro: ");
		String model = sc.nextLine();
		
		System.out.print("Retirada (dd/MM/yyyy HH:ss): ");
		Date start = sdf.parse(sc.nextLine());
		
		System.out.print("Devolução (dd/MM/yyyy HH:ss): ");
		Date finish = sdf.parse(sc.nextLine());
		
		CarRental carRental = new CarRental(start, finish, new Vehicle(model));
		
		System.out.print("Preço por hora: ");
		double pricePerHour = sc.nextDouble();
		
		System.out.print("Preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalService rentalService = new RentalService(pricePerDay, pricePerHour, new BrazilTaxService());
		
		rentalService.processInvoice(carRental);
		
		System.out.println("NOTA FISCAL");
		
		System.out.printf("Pagamento básico: %.2f%n", carRental.getInvoice().getBasicPayment());
		System.out.printf("Taxa: %.2f%n", carRental.getInvoice().getTax());
		System.out.printf("Total: %.2f%n", carRental.getInvoice().getTotalPayment());
		sc.close();	
		
	}

}
