package com.bank.service;

import com.bank.model.Account;
import com.bank.repository.AccountJpaEntity;
import com.bank.repository.AccountJpaRepository;
import com.bank.repository.BankServiceHelper;
import com.bank.spi.AdviseAccount;
import com.bank.spi.UpdateAccount;


public class ClientRepositoryAdaptor implements AdviseAccount,UpdateAccount{


	private AccountJpaRepository accountJpaRepository;
	private BankServiceHelper bankServiceHelper;

	@Override
	public Account consulterCompte(String name) {

		AccountJpaEntity cp = accountJpaRepository.getOne(name);
		if (cp == null)
			throw new RuntimeException("compte introuvable");
		return bankServiceHelper.ConvertToAccountEntity(cp);
	}

	@Override
	public void verser(String name, double montant) {
		Account cp = consulterCompte(name);
		cp.setBalance(cp.getBalance() + montant);
		accountJpaRepository.save(bankServiceHelper.ConvertToAccountJpa(cp));
	}

	@Override
	public void retirer(String name, double montant) {
		Account cp = consulterCompte(name);
		if (cp.getBalance() < montant)
			throw new RuntimeException("solde insufisant");
		cp.setBalance(cp.getBalance() - montant);
		accountJpaRepository.save(bankServiceHelper.ConvertToAccountJpa(cp));
	}

}
