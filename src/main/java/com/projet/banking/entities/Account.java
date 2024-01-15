package com.projet.banking.entities;

import java.util.List;

public class Account {
	private List<LoanAccount> loanAccounts;
	private List<SavingAccount> savingAccounts;

	public Account(List<LoanAccount> loanAccounts, List<SavingAccount> savingAccounts) {
		super();
		this.loanAccounts = loanAccounts;
		this.savingAccounts = savingAccounts;
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

}
