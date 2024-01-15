package com.projet.banking.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projet.banking.Repositories.LoanAccountRepository;
import com.projet.banking.Repositories.LoanTypeRepository;
import com.projet.banking.Repositories.StatusRepository;
import com.projet.banking.entities.LoanAccount;
import com.projet.banking.entities.LoanType;
import com.projet.banking.entities.Status;
import com.projet.banking.services.LoanAccountService;

@Service
public class AccountServiceImpl implements LoanAccountService {

	private LoanAccountRepository loanAccountRepository;
	private StatusRepository statusRepository;
	private LoanTypeRepository loanTypeRepository;

	

	public AccountServiceImpl(LoanAccountRepository loanAccountRepository, StatusRepository statusRepository,
			LoanTypeRepository loanTypeRepository) {
		super();
		this.loanAccountRepository = loanAccountRepository;
		this.statusRepository = statusRepository;
		this.loanTypeRepository = loanTypeRepository;
	}

	@Override
	public LoanAccount create(LoanAccount account) {
		Optional<Status> statusOptional = statusRepository.findById(account.getStatus().getId());
	    if (!statusOptional.isPresent())
	    	 account.setStatus(statusRepository.save(account.getStatus()));
	    
	    Optional<LoanType> loanTypeOptional = loanTypeRepository.findById(account.getLoanType().getId());
	    if (!loanTypeOptional.isPresent())
	    	account.setLoanType(loanTypeRepository.save(account.getLoanType()));
	    
	    
			
	    
		return loanAccountRepository.save(account);

	}

	@Override
	public List<LoanAccount> get() {
		return loanAccountRepository.findAll();

	}

	@Override
	public LoanAccount getById(long id) {
		return loanAccountRepository.getById(id) ;
	}
}
