package aula94;

public class Empregado {

	private int id;
	private String name;
	private double salario;

	public Empregado(int id, String name, double salario) {
		this.id = id;
		this.name = name;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String toString() {
		return this.id + ", " + this.name + ", " + String.format("%.2f", this.salario);
	}
	
	public void aumentaSalario(double porcentagem) {
		this.salario += this.salario * porcentagem / 100;
	}

}
