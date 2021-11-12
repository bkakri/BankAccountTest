package com.bank.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.model.Account;
import com.bank.repository.AccountJpaRepository;
import com.bank.repository.ClientJpaRepository;
import com.bank.spi.ClientAccountRepository;

@Service
public class ClientRepositoryAdaptor implements ClientAccountRepository {

	@Autowired
	private ClientJpaRepository clientJpaRepository;
	@Autowired
	private AccountJpaRepository accountJpaRepository;

	public ClientRepositoryAdaptor(ClientJpaRepository clientJpaRepository) {
		super();
		this.clientJpaRepository = clientJpaRepository;
	}

	@Override
	public Account consulterCompte(String name) {

		Account cp = accountJpaRepository.getOne(name);
		if (cp == null)
			throw new RuntimeException("compte introuvable");
		return cp;
	}

	@Override
	public void verser(String name, double montant) {
		
		Account cp = consulterCompte(name);
		cp.setBalance(cp.getBalance() + montant);
		accountJpaRepository.save(cp);
	}

	@Override
	public void retirer(String name, double montant) {
		Account cp = consulterCompte(name);
		if (cp.getBalance() < montant)
			throw new RuntimeException("solde insufisant");
		cp.setBalance(cp.getBalance() - montant);
		accountJpaRepository.save(cp);
	}

}
