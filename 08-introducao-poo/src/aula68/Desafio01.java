package aula68;

import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a largura e altura do retângulo: ");

		Retangulo r = new Retangulo();

		r.largura = sc.nextDouble();
		r.comprimento = sc.nextDouble();

		System.out.printf("AREA: %.2f%n", r.area());
		System.out.printf("PERIMETRO: %.2f%n", r.perimetro());
		System.out.printf("DIAGONAL: %.2f%n", r.diagonal());

		sc.close();

	}

}
