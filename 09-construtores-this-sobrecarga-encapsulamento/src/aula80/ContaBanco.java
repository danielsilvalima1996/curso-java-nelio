package aula80;

public class ContaBanco {

	private String nome;
	private int numero;
	private double saldo;

	public ContaBanco(String nome, int numero) {
		super();
		this.nome = nome;
		this.numero = numero;
	}

	public ContaBanco(String nome, int numero, double depositoInicial) {
		this.nome = nome;
		this.numero = numero;
		this.deposito(depositoInicial);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void saque(double valor) {
		if (valor + 5 <= this.saldo && valor >= 0) {
			this.saldo -= valor + 5;
		}
	}

	public void deposito(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
		}
	}

	public String toString() {
		return "Conta: " + this.numero + ", Nome: " + this.nome + ", Saldo: R$ " + String.format("%.2f", this.saldo);
	}

}
