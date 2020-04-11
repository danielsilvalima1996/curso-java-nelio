package aula69;

public class CalculadoraV2 {

	public static final double PI = 3.14159;

	public static double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}

	public static double volume(double raio) {
		return 4 * PI * Math.pow(raio, 3) / 3;
	}

}
