package aula52;

import java.util.Scanner;

public class Desafio03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testes = sc.nextInt();
		
		for (int i = 0; i < testes; i++) {
			double a = sc.nextDouble() * 2;
			double b = sc.nextDouble() * 3;
			double c = sc.nextDouble() * 5;
			
			double media = (a + b + c) / 10;
			
			System.out.printf("%.1f%n", media);
		}
		
		sc.close();
		
	}

}
