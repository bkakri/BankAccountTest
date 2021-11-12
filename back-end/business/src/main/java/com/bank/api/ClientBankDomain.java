package com.bank.api;



public interface ClientBankDomain  {
	
	public Double consulterCompte(String name);
	public void verser(String name,double montant);
	public void retirer(String name,double montant);
	
	
}
