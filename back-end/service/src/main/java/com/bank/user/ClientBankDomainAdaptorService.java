package com.bank.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bank.api.ClientBankDomain;

@RestController
public class ClientBankDomainAdaptorService {

	public ClientBankDomain clientBankDomain;

	public ClientBankDomainAdaptorService(ClientBankDomain clientBankDomain) {
		this.clientBankDomain = clientBankDomain;
	}
	
	

	@RequestMapping("/consultercompte")  
	public Double consulterCompte(String name) {
		Double montant =clientBankDomain.consulterCompte(name);
		return montant;
		
	}
	@RequestMapping(value="/verserMontant",method=RequestMethod.POST)   
	public void verser(String name, double montant) {
		
		clientBankDomain.verser(name, montant);
	}

	@RequestMapping(value="/retirerMontant",method=RequestMethod.POST)   
	public void retirer(String name, double montant) {
	
		clientBankDomain.retirer(name, montant);
	}

}
