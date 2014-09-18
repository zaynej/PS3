package main;

import java.util.Date;

public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();

	public Account() {
	}

	public Account(int id, double balance) {

		this.id = id;
		this.balance = balance;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return this.balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getIntrest() {
		return this.annualInterestRate;

	}

	public void setInterest(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;

	}

	public Date getDate() {
		return this.dateCreated;
	}

	public double getMonthlyInterestRate() {
		return this.annualInterestRate / 12;
	}

	public void withdraw(double amount)throws InsufficientFundsException {
		if (amount <= balance) {
			this.balance -= amount;
		} else {
			double need = amount - balance;
			throw new InsufficientFundsException(need);
		}
	}

	public void deposit(double amount) {
		this.balance += amount;
	}
}
