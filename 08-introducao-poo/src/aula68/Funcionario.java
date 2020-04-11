package aula68;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double taxa;
	
	public double salarioLiquido() {
		return salarioBruto - taxa;
	}
	
	public double incrementoSalario(double porcentagem) {
		return salarioBruto += salarioBruto * porcentagem / 100;
	}
	
	public String toString() {
		return nome
				+ ", R$ "
				+ String.format("%.2f", salarioLiquido());
	}

}
