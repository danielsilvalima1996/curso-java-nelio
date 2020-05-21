package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();

		System.out.println("Fim do programa!");

	}
	
	public static void method1() {
		System.out.println("***INICIO MÉTODO 1***");
		method2();
		System.out.println("***FIM MÉTODO 1***");
	}

	public static void method2() {
		System.out.println("***INÍCIO MÉTODO 2***");
		Scanner sc = new Scanner(System.in);

		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("Error de input!");
		}

		sc.close();
		
		System.out.println("***FIM MÉTODO 2***");
		
	}

}
