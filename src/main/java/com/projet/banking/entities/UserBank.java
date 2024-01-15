package com.projet.banking.entities;

import java.io.Serializable;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserBank implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5385397225013196793L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	private String username;
	private String password;
	private boolean isSelfServiceUser;
	private boolean authenticated;
	@OneToMany(fetch = FetchType.EAGER, targetEntity = LoanAccount.class)
	@JoinColumn(name = "user_bank_user_id")
	private List<LoanAccount> loanAccounts;
	
	@OneToMany(fetch = FetchType.EAGER, targetEntity = SavingAccount.class)
	@JoinColumn(name = "user_bank_user_id")
	private List<SavingAccount> savingAccounts;
	
	@OneToMany(fetch = FetchType.EAGER, targetEntity = Transaction.class)
	@JoinColumn(name = "user_bank_user_id")
	private List<Transaction> transactions;
	
	@OneToMany(fetch = FetchType.EAGER, targetEntity = Charge.class)
	@JoinColumn(name = "user_bank_user_id")
	private List<Charge> charges;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
		
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isSelfServiceUser() {
		return isSelfServiceUser;
	}
	public void setSelfServiceUser(boolean isSelfServiceUser) {
		this.isSelfServiceUser = isSelfServiceUser;
	}
	public boolean isAuthenticated() {
		return authenticated;
	}
	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}
	public List<LoanAccount> getLoanAccounts() {
		return loanAccounts;
	}
	public void setLoanAccounts(List<LoanAccount> loanAccounts) {
		this.loanAccounts = loanAccounts;
	}
	public List<SavingAccount> getSavingAccounts() {
		return savingAccounts;
	}
	public void setSavingAccounts(List<SavingAccount> savingAccounts) {
		this.savingAccounts = savingAccounts;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	public List<Charge> getCharges() {
		return charges;
	}
	public void setCharges(List<Charge> charges) {
		this.charges = charges;
	}
	

}
