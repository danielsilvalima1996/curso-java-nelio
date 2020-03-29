package aula53;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = (9 * c) / 5 + 32;
			System.out.printf("Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir (s/n)?");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
		
	}

}
