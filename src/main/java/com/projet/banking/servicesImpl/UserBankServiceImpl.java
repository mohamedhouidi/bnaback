package com.projet.banking.servicesImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projet.banking.Repositories.SavingAccountRepository;
import com.projet.banking.Repositories.TransactionRepository;
import com.projet.banking.Repositories.UserBankRepository;
import com.projet.banking.entities.Account;
import com.projet.banking.entities.AccountOptions;
import com.projet.banking.entities.Charge;
import com.projet.banking.entities.ListAccountOptions;
import com.projet.banking.entities.LoanAccount;
import com.projet.banking.entities.SavingAccount;
import com.projet.banking.entities.Transaction;
import com.projet.banking.entities.Transfert;
import com.projet.banking.entities.UserBank;
import com.projet.banking.services.UserBankService;

import jakarta.transaction.Transactional;

@Service
public class UserBankServiceImpl implements UserBankService{

	private UserBankRepository userBankRepository;
	private SavingAccountRepository savingAccountRepository; 
	private TransactionRepository transactionRepository;

	public UserBankServiceImpl(UserBankRepository userBankRepository,SavingAccountRepository savingAccountRepository,
			TransactionRepository transactionTypeRepository
) {
		this.userBankRepository = userBankRepository;
		this.savingAccountRepository = savingAccountRepository;
		this.transactionRepository = transactionTypeRepository;
	}
	
	
	@Override
	public UserBank get(UserBank user) {
		return userBankRepository.getByUsernameAndPassword(user.getUsername(), user.getPassword());
	}


	@Override
	public UserBank create(UserBank user) {
		return userBankRepository.save(user);
	}


	@Override
	public Account getAccounts(int userId) {
		Optional<UserBank> userBankOptional = userBankRepository.findById(userId);
	    if (!userBankOptional.isPresent())
			return null;
		List<LoanAccount> loanAccount = userBankRepository.getById(userId).getLoanAccounts();
		List<SavingAccount> savingAccount = userBankRepository.getById(userId).getSavingAccounts();
		Account account = new Account(loanAccount,savingAccount);
		return account;
	}


	@Override
	public List<Transaction> getTransactions(int id) {
		Optional<UserBank> userBankOptional = userBankRepository.findById(id);
	    if (!userBankOptional.isPresent())
			return null;
	    List<Transaction> transactions = userBankOptional.get().getTransactions();
	    return transactions;
	}


	@Override
	public List<Charge> getCharges(int id) {
		Optional<UserBank> userBankOptional = userBankRepository.findById(id);
	    if (!userBankOptional.isPresent())
			return null;
	    return userBankOptional.get().getCharges();
	}


	@Override
	public ListAccountOptions getOptionsAccounts(int id) {
		Optional<UserBank> userBankOptional = userBankRepository.findById(id);
	    if (!userBankOptional.isPresent())
			return null;
		//List<LoanAccount> loanAccount = userBankRepository.getById(id).getLoanAccounts();
		List<SavingAccount> savingAccount = userBankRepository.getById(id).getSavingAccounts();
		//AccountType accountType = new AccountType(1,"accountType.loan","Loan Account");
		List<AccountOptions> AccountOptions = new ArrayList<AccountOptions>();
 		/*loanAccount.forEach((loan)->{
			AccountOptions account = new AccountOptions(loan.getId(),loan.getAccountNo(),accountType);
			AccountOptions.add(account);
		}
		);*/
 		savingAccount.forEach((saving)->{
			AccountOptions account = new AccountOptions(saving.getId(),saving.getAccountNo(),saving.getAccountType());
			AccountOptions.add(account);
		}
		);
 		
		
		
		return new ListAccountOptions(AccountOptions,AccountOptions);
	}


	@Override
	@Transactional
	public Transaction transfert(Transfert transfert,int id) {
	 	SavingAccount toAccount = savingAccountRepository.getById(transfert.getToAccount().getAccountId());
	 	SavingAccount fromAccount = savingAccountRepository.getById(transfert.getFromAccount().getAccountId());
	 	toAccount.setAccountBalance(toAccount.getAccountBalance()+transfert.getAmount());
	 	fromAccount.setAccountBalance(fromAccount.getAccountBalance()-transfert.getAmount());
	 	int [] date = new int[3];
	 	date[0] = Integer.parseInt(new SimpleDateFormat("yyyy").format(transfert.getDate()));
	 	date[1] = Integer.parseInt(new SimpleDateFormat("MM").format(transfert.getDate()));
	 	date[2] = Integer.parseInt(new SimpleDateFormat("dd").format(transfert.getDate()));
	 	
	 	Transaction transaction = new Transaction(date,transfert.getAmount(),date);
	 	transaction.setUserBank(userBankRepository.findById(id).get());
	 	this.transactionRepository.save(transaction);
		return this.transactionRepository.save(transaction);
	}

}
