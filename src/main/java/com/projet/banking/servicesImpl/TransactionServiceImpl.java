package com.projet.banking.servicesImpl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.projet.banking.Repositories.CurrencyRepository;
import com.projet.banking.Repositories.TransactionRepository;
import com.projet.banking.Repositories.TransactionTypeRepository;
import com.projet.banking.entities.Transaction;
import com.projet.banking.entities.TransactionType;
import com.projet.banking.services.TransactionService;

@Service
public class TransactionServiceImpl implements TransactionService{

	private TransactionRepository transactionrepository;
	private CurrencyRepository currencyRepository;
	private TransactionTypeRepository transactionTypeRepository;
	

	public TransactionServiceImpl(TransactionRepository transactionrepository, CurrencyRepository currencyRepository,
			TransactionTypeRepository transactionTypeRepository) {
		super();
		this.transactionrepository = transactionrepository;
		this.currencyRepository = currencyRepository;
		this.transactionTypeRepository = transactionTypeRepository;
	}


	@Override
	public Transaction create(Transaction transaction) {
		
		transaction.setCurrency(currencyRepository.save(transaction.getCurrency()));

		Optional<TransactionType> transactionTypeOptional = transactionTypeRepository.findById(transaction.getType().getId());
	    if (!transactionTypeOptional.isPresent())
	    	transaction.setType(transactionTypeRepository.save(transaction.getType()));
		
		return transactionrepository.save(transaction);
	}

}
