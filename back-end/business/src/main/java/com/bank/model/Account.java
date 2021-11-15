package com.bank.model;

public class Account {

	private String name;
	private double balance;
	private Client client;
	
	
	public Account() {
		super();
	}

	public Account(String name, double balance, Client client) {
		super();
		this.name = name;
		this.balance = balance;
		this.client = client;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	

}
