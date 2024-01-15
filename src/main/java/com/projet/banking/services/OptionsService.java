package com.projet.banking.services;

import java.util.List;

import com.projet.banking.entities.LoanPurposeOption;
import com.projet.banking.entities.Options;
import com.projet.banking.entities.ProductOption;

public interface OptionsService {
	
	public List<ProductOption> createProducts(List<ProductOption> productOptions );
	public List<LoanPurposeOption> createPurpose(List<LoanPurposeOption> purposeOptions);
	public Options getOptions();

}
