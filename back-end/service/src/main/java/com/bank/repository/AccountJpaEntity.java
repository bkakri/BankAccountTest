package com.bank.repository;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class AccountJpaEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long code;
	private String name;
	private double balance;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "name_client", nullable = true)
	private ClientJpaEntity client;
	

	public AccountJpaEntity(String name, double balance, ClientJpaEntity client) {
		super();
		this.name = name;
		this.balance = balance;
		this.client = client;
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
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public ClientJpaEntity getClient() {
		return client;
	}
	public void setClient(ClientJpaEntity client) {
		this.client = client;
	}
	
	

}
