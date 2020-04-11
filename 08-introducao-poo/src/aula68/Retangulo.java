package aula68;

public class Retangulo {

	public double largura;
	public double comprimento;

	public double area() {
		return largura * comprimento;
	}

	public double perimetro() {
		return 2 * (largura + comprimento);
	}

	public double diagonal() {
		double l2 = Math.pow(largura, 2);
		double c2 = Math.pow(comprimento, 2);
		return Math.sqrt(l2 + c2);
	}

}
