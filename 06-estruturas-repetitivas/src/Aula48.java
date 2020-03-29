

import java.util.Scanner;

public class Aula48 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.print("Soma " + soma);
		
		sc.close();
		
	}

}
