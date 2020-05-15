package entities;

public class PessoaFisica extends Pessoa {

	private Double gastosSaude;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calcularImpostos() {
		if (this.getRendaAnual() < 200000) {
			return this.getRendaAnual() * 0.15 - this.gastosSaude * 0.5;
		} else {
			return this.getRendaAnual() * 0.25 - this.gastosSaude * 0.5;
		}
	}
	
}
