import java.util.Scanner;

public class Aula59 {

	public static void main(String[] args) {

		double y = 25.0;
		double x = Math.sqrt(y);
		System.out.println(x);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite três números: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maior = max(a, b, c);

		mostrarResultado(maior);

		sc.close();

	}

	public static int max(int a, int b, int c) {
		int auxiliar;
		if (a > b && a > c) {
			auxiliar = a;
		} else if (b > a && b > c) {
			auxiliar = b;
		} else {
			auxiliar = c;
		}
		return auxiliar;
	}

	public static void mostrarResultado(int maior) {
		System.out.println(maior);
	}

}
