package com.projet.banking.entities;

import java.util.List;

public class ListAccountOptions {

	private List<AccountOptions> fromAccountOptions;
    private List<AccountOptions> toAccountOptions;
    
    
	public ListAccountOptions() {
		super();
	}
	public ListAccountOptions(List<AccountOptions> fromAccountOptions, List<AccountOptions> toAccountOptions) {
		super();
		this.fromAccountOptions = fromAccountOptions;
		this.toAccountOptions = toAccountOptions;
	}
	public List<AccountOptions> getFromAccountOptions() {
		return fromAccountOptions;
	}
	public void setFromAccountOptions(List<AccountOptions> fromAccountOptions) {
		this.fromAccountOptions = fromAccountOptions;
	}
	public List<AccountOptions> getToAccountOptions() {
		return toAccountOptions;
	}
	public void setToAccountOptions(List<AccountOptions> toAccountOptions) {
		this.toAccountOptions = toAccountOptions;
	}
    
    
}
