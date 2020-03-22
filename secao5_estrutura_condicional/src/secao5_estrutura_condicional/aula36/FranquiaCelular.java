package secao5_estrutura_condicional.aula36;

import java.util.Scanner;

public class FranquiaCelular {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int minutos = sc.nextInt();
		
		double conta = 50;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2;
		}
		
		System.out.printf("Valor a pagar: R$ %.2f", conta);
		
		sc.close();
		
	}

}
