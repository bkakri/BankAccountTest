package com.bank.model;

import java.util.List;



public class Client {

	private String name;
	private List <Account> accounts;
	
	public Client() {
		super();
	}
	public Client(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}
	
	

}
