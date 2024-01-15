package com.projet.banking.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.banking.entities.LoanAccount;
import com.projet.banking.entities.SavingAccount;
import com.projet.banking.services.SavingAccountService;
import com.projet.banking.servicesImpl.AccountServiceImpl;

@RestController
@RequestMapping("/account")
@CrossOrigin(origins = {"http://localhost:4200"})

public class AccountController {

	private AccountServiceImpl accountService;
	private SavingAccountService savingAccountService;
	public AccountController(AccountServiceImpl accountService,
			SavingAccountService savingAccountService) {
		this.accountService=accountService;
		this.savingAccountService=savingAccountService;
	}
	
	@PostMapping("/create/loan")
	public LoanAccount create(@RequestBody LoanAccount account) {
		
		return accountService.create(account);
	}
	@PostMapping("/create/list/loan")
	public List<LoanAccount> create(@RequestBody List<LoanAccount> accounts) {
		accounts.forEach((account)->{
			accountService.create(account);
		});
		return accounts;
	}
	
	@PostMapping("/create/saving")
	public SavingAccount create(@RequestBody SavingAccount account) {
		
		return savingAccountService.create(account);
	}
	@GetMapping("/get")
	public List<SavingAccount> get(){
		return savingAccountService.get();
	}
	@GetMapping("/get/loan/{id}")
	public LoanAccount getLoanById(@PathVariable long id) {
		return accountService.getById(id);
	}
	
	@GetMapping("/get/saving/{id}")
	public SavingAccount getSavingById(@PathVariable long id) {
		return savingAccountService.getById(id);
	}
}
