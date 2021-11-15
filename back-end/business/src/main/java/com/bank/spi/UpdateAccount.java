package com.bank.spi;


public interface UpdateAccount {

	public void verser(String codeCompte,double montant);
	public void retirer(String codeCompte,double montant);
}
