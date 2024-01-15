package com.projet.banking.Controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.banking.entities.Transaction;
import com.projet.banking.services.TransactionService;

@RestController
@RequestMapping("/transaction")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TransactionController {
	private TransactionService transactionService;

	public TransactionController(TransactionService transactionService) {
		super();
		this.transactionService = transactionService;
	}
	
	@PostMapping("/create")
	public Transaction create(@RequestBody Transaction transaction) {
		
		return transactionService.create(transaction);
	}

}
