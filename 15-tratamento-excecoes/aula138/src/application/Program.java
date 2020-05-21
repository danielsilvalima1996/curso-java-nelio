package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Número do quarto: ");
		int number = sc.nextInt();
		System.out.print("Data do check-in (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Data do check-out (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		if (!checkOut.after(checkIn)) {
			System.out.println("Error na reserva: Data do check-out não pode ser menor que a data do check-in!");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reserva: " + reservation.toString());

			System.out.println();
			System.out.println("Digite as datas para atualizar a reserva: ");
			System.out.print("Data do check-in (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Data do check-out (dd/MM/yyyy): ");
			checkOut = sdf.parse(sc.next());

			Date now = new Date();

			if (checkIn.before(now) || checkOut.before(now)) {
				System.out
						.println("Error na reserva: As datas para atualização não podem ser anteriores a data atual!");
			} else if (!checkOut.after(checkIn)) {
				System.out.println("Error na reserva: Data do check-out não pode ser menor que a data do check-in!");
			} else {
				reservation.updateDate(checkIn, checkOut);
				System.out.println("Reserva: " + reservation.toString());
			}

		}

		sc.close();

	}

}
