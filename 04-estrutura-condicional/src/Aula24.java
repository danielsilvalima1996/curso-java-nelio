import java.util.Scanner;

public class Aula24 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Leitura de string
		/*
		 * String x;
		 * 
		 * x = sc.next();
		 * 
		 */
		// leitura de inteiros
		/*
		 * int x; x = sc.nextInt();
		 */

		// leitura de ponto flutuando
		/*
		 * double x;
		 * 
		 * x = sc.nextDouble();
		 */

		// leitura de char
		/*
		char x;
		x = sc.next().charAt(0);
		*/
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		sc.close();

	}

}
