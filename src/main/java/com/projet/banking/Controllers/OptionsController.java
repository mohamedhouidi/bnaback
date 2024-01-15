package com.projet.banking.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.banking.entities.LoanPurposeOption;
import com.projet.banking.entities.Options;
import com.projet.banking.entities.ProductOption;
import com.projet.banking.entities.Transaction;
import com.projet.banking.services.OptionsService;

@RestController
@RequestMapping("/options")
@CrossOrigin(origins = {"http://localhost:4200"})
public class OptionsController {

	private OptionsService optionsService;
	
	
	public OptionsController(OptionsService optionsService) {
		super();
		this.optionsService = optionsService;
	}


	@GetMapping("/get")
	public Options get(){
		return optionsService.getOptions();
	}
	
	
	@PostMapping("/create/product")
	public List<ProductOption> createProductOption(@RequestBody List<ProductOption> products) {
		
		return optionsService.createProducts(products);
	}
	
	@PostMapping("/create/purpose")
	public List<LoanPurposeOption> createLoanPurposeOption(@RequestBody List<LoanPurposeOption> purposeOptions) {
		
		return optionsService.createPurpose(purposeOptions);
	}
	
	

}
