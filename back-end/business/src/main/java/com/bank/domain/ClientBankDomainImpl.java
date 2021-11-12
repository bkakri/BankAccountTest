package com.bank.domain;

import com.bank.api.ClientBankDomain;
import com.bank.spi.ClientAccountRepository;

public class ClientBankDomainImpl implements ClientBankDomain {

	public ClientAccountRepository clientAccountRepository;

	
	public ClientBankDomainImpl(ClientAccountRepository clientAccountRepository) {
		this.clientAccountRepository = clientAccountRepository;
	}


	@Override
	public Double consulterCompte(String name) {
		
		return clientAccountRepository.consulterCompte(name).getBalance();
	}


	@Override
	public void verser(String name, double montant) {
		
	clientAccountRepository.verser(name, montant);
	}


	@Override
	public void retirer(String name, double montant) {
		clientAccountRepository.retirer(name, montant);
	}
 
	
}
