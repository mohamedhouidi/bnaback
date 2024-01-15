package com.projet.banking.services;

import java.util.List;

import com.projet.banking.entities.LoanAccount;

public interface LoanAccountService {

	public LoanAccount create(LoanAccount loanAccount);
	public List<LoanAccount> get();
	public LoanAccount getById(long id);
}
