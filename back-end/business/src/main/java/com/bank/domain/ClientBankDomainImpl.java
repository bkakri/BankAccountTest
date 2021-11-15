package com.bank.domain;

import com.bank.api.ClientBankDomain;
import com.bank.spi.AdviseAccount;

import com.bank.spi.UpdateAccount;

public class ClientBankDomainImpl implements ClientBankDomain {

	private  AdviseAccount adviseAccount;
	private  UpdateAccount updateAccount;

	@Override
	public Double consulterCompte(String name) {

		return adviseAccount.consulterCompte(name).getBalance();
	}

	@Override
	public void verser(String name, double montant) {

		updateAccount.verser(name, montant);
	}

	@Override
	public void retirer(String name, double montant) {
		updateAccount.retirer(name, montant);
	}

}
