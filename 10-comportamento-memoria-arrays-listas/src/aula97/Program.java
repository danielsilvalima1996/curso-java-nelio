package aula97;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m, n;
		
		m = sc.nextInt();
		n = sc.nextInt();
		
		int [][] mat = new int[m][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Posição: " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (i + 1 < mat.length) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
				}
			}
		}
		
		sc.close();

	}

}
