package com.projet.banking.services;

import java.util.List;

import com.projet.banking.entities.SavingAccount;

public interface SavingAccountService {

	public SavingAccount create(SavingAccount savingAccount);
	public List<SavingAccount> get();
	public SavingAccount getById(long id);
}
