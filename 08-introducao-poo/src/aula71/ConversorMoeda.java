package aula71;

public class ConversorMoeda {
	
	public final int iof = 6;
	public double valorDolar;
	public double qtdDolar;
	
	public double converterDolar() {
		double valorReais = (valorDolar * qtdDolar);
		return valorReais += valorReais * iof / 100;
	}

}
