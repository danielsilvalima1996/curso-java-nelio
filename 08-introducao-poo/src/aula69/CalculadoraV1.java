package aula69;

public class CalculadoraV1 {

	public final double PI = 3.14159;

	public double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}

	public double volume(double raio) {
		return 4 * PI * Math.pow(raio, 3) / 3;
	}

}
