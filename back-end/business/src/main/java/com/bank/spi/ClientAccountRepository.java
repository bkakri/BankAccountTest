package com.bank.spi;

import com.bank.model.Account;

public interface ClientAccountRepository {

	public Account consulterCompte(String codeCompte);
	public void verser(String codeCompte,double montant);
	public void retirer(String codeCompte,double montant);
}
