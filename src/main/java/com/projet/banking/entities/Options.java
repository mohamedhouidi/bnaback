package com.projet.banking.entities;

import java.util.List;

public class Options {

	private List<ProductOption> productOptions;
	private List<LoanPurposeOption> purposeOptions;
	
	public Options() {
		super();
	}
	public Options(List<ProductOption> productOptions, List<LoanPurposeOption> purposeOptions) {
		super();
		this.productOptions = productOptions;
		this.purposeOptions = purposeOptions;
	}
	public List<ProductOption> getProductOptions() {
		return productOptions;
	}
	public void setProductOptions(List<ProductOption> productOptions) {
		this.productOptions = productOptions;
	}
	public List<LoanPurposeOption> getPurposeOptions() {
		return purposeOptions;
	}
	public void setPurposeOptions(List<LoanPurposeOption> purposeOptions) {
		this.purposeOptions = purposeOptions;
	}
	
	
}
