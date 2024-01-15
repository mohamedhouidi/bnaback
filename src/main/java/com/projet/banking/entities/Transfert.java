package com.projet.banking.entities;

import java.util.Date;

public class Transfert {
	private AccountOptions toAccount;
	private AccountOptions fromAccount;
	private int amount;
	private Date date;
	private String remarks;
	public AccountOptions getToAccount() {
		return toAccount;
	}
	public void setToAccount(AccountOptions toAccount) {
		this.toAccount = toAccount;
	}
	public AccountOptions getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(AccountOptions fromAccount) {
		this.fromAccount = fromAccount;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	
	

}
