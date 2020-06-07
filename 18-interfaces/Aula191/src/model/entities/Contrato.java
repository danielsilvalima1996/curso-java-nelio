package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private int numero;
	private Date data;
	private double valorTotal;
	private List<Prestacao> prestacoes = new ArrayList<Prestacao>();

	public Contrato(int numero, Date data, double valorTotal) {
		super();
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<Prestacao> getPrestacoes() {
		return prestacoes;
	}
	
	public void addPrestacao(Prestacao prestacao) {
		this.prestacoes.add(prestacao);
	}
	
	public void removePrestacao(Prestacao prestacao) {
		this.prestacoes.remove(prestacao);
	}

}
