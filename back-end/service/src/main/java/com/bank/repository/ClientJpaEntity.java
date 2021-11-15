package com.bank.repository;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class ClientJpaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code;
	private String name;
	@OneToMany(mappedBy = "client")
	private List<AccountJpaEntity> Accounts;
	
	public ClientJpaEntity(String name) {
		super();
		this.name = name;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<AccountJpaEntity> getAccounts() {
		return Accounts;
	}
	public void setAccounts(List<AccountJpaEntity> accounts) {
		Accounts = accounts;
	}
	
	
}
