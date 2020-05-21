package model.entities;

import model.exceptions.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdraw;

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdraw) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdraw = withdraw;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(Double withdraw) {
		this.withdraw = withdraw;
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

	public void withdraw(double amount) throws DomainException {
		if (amount > this.withdraw) {
			throw new DomainException("O valor excede o limite do saque");
		} else if (amount > this.balance) {
			throw new DomainException("Saldo insuficiente");
		}
		this.balance -= amount;
	}

}
