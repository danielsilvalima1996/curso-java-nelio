package aula68;

public class Aluno {
	
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double calcularMedia() {
		return n1 + n2 + n3;
	}
	
	public double pontosFaltantes() {
		if (calcularMedia() < 60.0) {
			return 60.0 - calcularMedia();
		} else {
			return 0.00;
		}
	}

}
