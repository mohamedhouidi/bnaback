package com.projet.banking.Controllers;


import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.banking.entities.Account;
import com.projet.banking.entities.Charge;
import com.projet.banking.entities.ListAccountOptions;
import com.projet.banking.entities.Transaction;
import com.projet.banking.entities.Transfert;
import com.projet.banking.entities.UserBank;
import com.projet.banking.services.UserBankService;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = {"http://localhost:4200"})
public class UserBankController {

	private UserBankService userBankService;
	public UserBankController( UserBankService userBankService) {
		this.userBankService = userBankService;

	}
	@PostMapping("/create")
	public UserBank create(@RequestBody UserBank user) {
		return userBankService.create(user);
	}
	
	

	@PostMapping("/transfert/{id}")
	public Transaction transfert(@PathVariable int id,@RequestBody Transfert transfert) {
		
		
		
		return this.userBankService.transfert(transfert,id);
	}
	
	
	@PostMapping("/get")
	public UserBank get(@RequestBody UserBank user) {
		return userBankService.get(user);
	}
	@GetMapping("/get/{id}")
	public Account getById(@PathVariable int id) {
		return userBankService.getAccounts(id);
	}
	
	@GetMapping("/get/options/{id}")
	public ListAccountOptions getOptionsById(@PathVariable int id) {
		return userBankService.getOptionsAccounts(id);
	}
	
	@GetMapping("/get/transactions/{id}")
	public List<Transaction> getTransactions(@PathVariable int id) {
		return userBankService.getTransactions(id);
	}
	
	@GetMapping("/get/charges/{id}")
	public List<Charge> getCharges(@PathVariable int id) {
		return userBankService.getCharges(id);
	}
}
