package com.bank.repository;

import com.bank.model.Account;
import com.bank.model.Client;

public class BankServiceHelper {

	
	public Account ConvertToAccountEntity(AccountJpaEntity Acountjpa) {
		return new Account(Acountjpa.getName(),Acountjpa.getBalance() ,converttoClientEntity(Acountjpa.getClient())) ;
	}
	public Client converttoClientEntity(ClientJpaEntity clientjpa) {
		return new Client(clientjpa.getName());	
	}
	
	public AccountJpaEntity ConvertToAccountJpa(Account account) {
		return new	AccountJpaEntity(account.getName(),account.getBalance(),convertToClientJpa(account.getClient()));	
	}
	
	public ClientJpaEntity convertToClientJpa(Client client) {
		return new	ClientJpaEntity(client.getName());
	}
	
	
}

