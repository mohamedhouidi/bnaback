package com.projet.banking.servicesImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.projet.banking.Repositories.LoanPurposeOptionRepository;
import com.projet.banking.Repositories.ProductOptionRepository;
import com.projet.banking.entities.LoanPurposeOption;
import com.projet.banking.entities.Options;
import com.projet.banking.entities.ProductOption;
import com.projet.banking.services.OptionsService;

@Service
public class OptionsServiceImpl implements OptionsService{
	
	private ProductOptionRepository productOptionRepository;
	private LoanPurposeOptionRepository loanPurposeOptionRepository;
	

	public OptionsServiceImpl(ProductOptionRepository productOptionRepository,
			LoanPurposeOptionRepository loanPurposeOptionRepository) {
		super();
		this.productOptionRepository = productOptionRepository;
		this.loanPurposeOptionRepository = loanPurposeOptionRepository;
	}

	@Override
	public List<ProductOption> createProducts(List<ProductOption> productOptions) {
		productOptions.forEach((productOption)->{
			productOptionRepository.save(productOption);
		});
		return productOptions;
	}

	@Override
	public List<LoanPurposeOption> createPurpose(List<LoanPurposeOption> purposeOptions) {
		purposeOptions.forEach((purposeOption)->{
			loanPurposeOptionRepository.save(purposeOption);
		});
		return purposeOptions;
	}

	@Override
	public Options getOptions() {
		return new Options(productOptionRepository.findAll(),loanPurposeOptionRepository.findAll());
	}

}
