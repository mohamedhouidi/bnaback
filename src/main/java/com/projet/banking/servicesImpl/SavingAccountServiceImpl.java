package com.projet.banking.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projet.banking.Repositories.AccountTypeRepository;
import com.projet.banking.Repositories.CurrencyRepository;
import com.projet.banking.Repositories.DepositTypeRepository;
import com.projet.banking.Repositories.SavingAccountRepository;
import com.projet.banking.Repositories.StatusRepository;
import com.projet.banking.Repositories.SubStatusRepository;
import com.projet.banking.entities.AccountType;
import com.projet.banking.entities.DepositType;
import com.projet.banking.entities.SavingAccount;
import com.projet.banking.entities.Status;
import com.projet.banking.entities.SubStatus;
import com.projet.banking.services.SavingAccountService;

@Service
public class SavingAccountServiceImpl implements SavingAccountService {

	private StatusRepository statusRepository;
	private CurrencyRepository currencyRepository;
	private AccountTypeRepository accountTypeRepository;
	private SubStatusRepository subStatusRepository;
	private DepositTypeRepository depositTypeRepository;
	private SavingAccountRepository savingAccountRepository; 
	
	
	
	

	public SavingAccountServiceImpl(StatusRepository statusRepository, CurrencyRepository currencyRepository,
			AccountTypeRepository accountTypeRepository, SubStatusRepository subStatusRepository,
			DepositTypeRepository depositTypeRepository, SavingAccountRepository savingAccountRepository) {
		super();
		this.statusRepository = statusRepository;
		this.currencyRepository = currencyRepository;
		this.accountTypeRepository = accountTypeRepository;
		this.subStatusRepository = subStatusRepository;
		this.depositTypeRepository = depositTypeRepository;
		this.savingAccountRepository = savingAccountRepository;
	}

	@Override
	public SavingAccount create(SavingAccount savingAccount) {
		Optional<Status> statusOptional = statusRepository.findById(savingAccount.getStatus().getId());
	    if (!statusOptional.isPresent())
	    	savingAccount.setStatus(statusRepository.save(savingAccount.getStatus()));
	    
	    Optional<DepositType> depositTypeOptional = depositTypeRepository.findById(savingAccount.getDepositType().getId());
	    if (!depositTypeOptional.isPresent())
	    	savingAccount.setDepositType(depositTypeRepository.save(savingAccount.getDepositType()));
	    
	    Optional<SubStatus> subStatusOptional = subStatusRepository.findById(savingAccount.getSubStatus().getId());
	    if (!subStatusOptional.isPresent())
	    	savingAccount.setSubStatus(subStatusRepository.save(savingAccount.getSubStatus()));
	    
	    Optional<AccountType> accountTypeOptional = accountTypeRepository.findById(savingAccount.getAccountType().getId());
	    if (!accountTypeOptional.isPresent())
	    	savingAccount.setAccountType(accountTypeRepository.save(savingAccount.getAccountType()));
	    
	
	    /*Optional<Currency> currencyOptional = currencyRepository.getByCode(savingAccount.getCurrency().getCode());
	    if (!currencyOptional.isPresent())*/
	    	savingAccount.setCurrency(currencyRepository.save(savingAccount.getCurrency()));
	    
	    
			
	    
		return savingAccountRepository.save(savingAccount);

	}

	@Override
	public List<SavingAccount> get() {
		return savingAccountRepository.findAll();
	}

	@Override
	public SavingAccount getById(long id) {
		return savingAccountRepository.getById(id);
	}

}
