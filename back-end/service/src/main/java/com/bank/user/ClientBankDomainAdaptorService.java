package com.bank.user;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.api.ClientBankDomain;

@RestController
public class ClientBankDomainAdaptorService {

	private ClientBankDomain clientBankDomain;

	@RequestMapping(path = "api/v1/clients/{nameAccount}")
	public Double consulterCompte(@PathVariable(name = "nameAccount") String name) {
		return clientBankDomain.consulterCompte(name);

	}

	@PostMapping(path = "api/v1/clients")
	public void saveOperation(@RequestBody String name, double montant, String typeOperation) {

			if (typeOperation.equals("VERS")) {

				clientBankDomain.verser(name, montant);
			} else if (typeOperation.equals("RETR")) {

				clientBankDomain.retirer(name, montant);
			}

	}
}
