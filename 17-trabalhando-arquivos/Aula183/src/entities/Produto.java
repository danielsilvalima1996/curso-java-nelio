package entities;

public class Produto {
	
	private String descricao;
	private double preco;
	private int quantidade;
	
	public Produto(String descricao, double preco, int quantidade) {
		super();
		this.descricao = descricao;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	@Override
	public String toString() {
		return descricao + ", " + String.format("%.2f", preco) + ", " + quantidade;
	}
	
	public double total() {
		return preco * quantidade;
	}
}
