package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<Integer>();
		
		System.out.print("Deseja ler quantas String: ");
		int n = sc.nextInt();
		
//		ps.addValue("Maria");
		
		for (int i = 0; i < n; i++) {
			ps.addValue(sc.nextInt());
		}
		
		ps.print();
		Integer x = ps.first();
		
		System.out.println("First: " + x);
		
		sc.close();

	}

}
