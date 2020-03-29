import java.util.Scanner;

public class Aula42 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Largura: ");
		double largura = sc.nextDouble();
		
		System.out.print("Comprimento: ");
		double comprimento = sc.nextDouble();
		
		System.out.print("Metro Quadrado R$: ");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PREÇO = %.2f%n", preco);
		
		sc.close();

	}

}
