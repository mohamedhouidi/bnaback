package com.projet.banking.services;

import java.util.List;

import com.projet.banking.entities.Account;
import com.projet.banking.entities.Charge;
import com.projet.banking.entities.ListAccountOptions;
import com.projet.banking.entities.Transaction;
import com.projet.banking.entities.Transfert;
import com.projet.banking.entities.UserBank;

public interface UserBankService {

	public UserBank get(UserBank user);

	public UserBank create(UserBank user);

	public Account getAccounts(int userId);
	
	public List<Transaction> getTransactions(int id);
	
	public List<Charge> getCharges(int id);
	
	public ListAccountOptions getOptionsAccounts(int id);
	
	public Transaction transfert(Transfert transfert,int id);
;
}
