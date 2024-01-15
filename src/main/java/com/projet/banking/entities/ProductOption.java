package com.projet.banking.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductOption implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 4660831776299618482L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private Boolean includeInBorrowerCycle;
    private Boolean useBorrowerCycle;
    private Boolean isLinkedToFloatingInterestRates;
    private Boolean isFloatingInterestRateCalculationAllowed;
    private Boolean allowVariableInstallments;
    private Boolean isInterestRecalculationEnabled;
    private Boolean canDefineInstallmentAmount;
    private List<String> principalVariationsForBorrowerCycle;
    private List<String> interestRateVariationsForBorrowerCycle;
    private List<String> numberOfRepaymentVariationsForBorrowerCycle;
    private Boolean canUseForTopup;
    private Boolean isRatesEnabled;
    private Boolean multiDisburseLoan;
    private Boolean holdGuaranteeFunds;
    private Boolean accountMovesOutOfNPAOnlyOnArrearsCompletion;
    private Boolean syncExpectedWithDisbursementDate;
    private Boolean isEqualAmortization;
	public ProductOption(Long id, String name, Boolean includeInBorrowerCycle, Boolean useBorrowerCycle,
			Boolean isLinkedToFloatingInterestRates, Boolean isFloatingInterestRateCalculationAllowed,
			Boolean allowVariableInstallments, Boolean isInterestRecalculationEnabled,
			Boolean canDefineInstallmentAmount, List<String> principalVariationsForBorrowerCycle,
			List<String> interestRateVariationsForBorrowerCycle,
			List<String> numberOfRepaymentVariationsForBorrowerCycle, Boolean canUseForTopup, Boolean isRatesEnabled,
			Boolean multiDisburseLoan, Boolean holdGuaranteeFunds, Boolean accountMovesOutOfNPAOnlyOnArrearsCompletion,
			Boolean syncExpectedWithDisbursementDate, Boolean isEqualAmortization) {
		super();
		this.id = id;
		this.name = name;
		this.includeInBorrowerCycle = includeInBorrowerCycle;
		this.useBorrowerCycle = useBorrowerCycle;
		this.isLinkedToFloatingInterestRates = isLinkedToFloatingInterestRates;
		this.isFloatingInterestRateCalculationAllowed = isFloatingInterestRateCalculationAllowed;
		this.allowVariableInstallments = allowVariableInstallments;
		this.isInterestRecalculationEnabled = isInterestRecalculationEnabled;
		this.canDefineInstallmentAmount = canDefineInstallmentAmount;
		this.principalVariationsForBorrowerCycle = principalVariationsForBorrowerCycle;
		this.interestRateVariationsForBorrowerCycle = interestRateVariationsForBorrowerCycle;
		this.numberOfRepaymentVariationsForBorrowerCycle = numberOfRepaymentVariationsForBorrowerCycle;
		this.canUseForTopup = canUseForTopup;
		this.isRatesEnabled = isRatesEnabled;
		this.multiDisburseLoan = multiDisburseLoan;
		this.holdGuaranteeFunds = holdGuaranteeFunds;
		this.accountMovesOutOfNPAOnlyOnArrearsCompletion = accountMovesOutOfNPAOnlyOnArrearsCompletion;
		this.syncExpectedWithDisbursementDate = syncExpectedWithDisbursementDate;
		this.isEqualAmortization = isEqualAmortization;
	}
	public ProductOption() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getIncludeInBorrowerCycle() {
		return includeInBorrowerCycle;
	}
	public void setIncludeInBorrowerCycle(Boolean includeInBorrowerCycle) {
		this.includeInBorrowerCycle = includeInBorrowerCycle;
	}
	public Boolean getUseBorrowerCycle() {
		return useBorrowerCycle;
	}
	public void setUseBorrowerCycle(Boolean useBorrowerCycle) {
		this.useBorrowerCycle = useBorrowerCycle;
	}
	public Boolean getIsLinkedToFloatingInterestRates() {
		return isLinkedToFloatingInterestRates;
	}
	public void setIsLinkedToFloatingInterestRates(Boolean isLinkedToFloatingInterestRates) {
		this.isLinkedToFloatingInterestRates = isLinkedToFloatingInterestRates;
	}
	public Boolean getIsFloatingInterestRateCalculationAllowed() {
		return isFloatingInterestRateCalculationAllowed;
	}
	public void setIsFloatingInterestRateCalculationAllowed(Boolean isFloatingInterestRateCalculationAllowed) {
		this.isFloatingInterestRateCalculationAllowed = isFloatingInterestRateCalculationAllowed;
	}
	public Boolean getAllowVariableInstallments() {
		return allowVariableInstallments;
	}
	public void setAllowVariableInstallments(Boolean allowVariableInstallments) {
		this.allowVariableInstallments = allowVariableInstallments;
	}
	public Boolean getIsInterestRecalculationEnabled() {
		return isInterestRecalculationEnabled;
	}
	public void setIsInterestRecalculationEnabled(Boolean isInterestRecalculationEnabled) {
		this.isInterestRecalculationEnabled = isInterestRecalculationEnabled;
	}
	public Boolean getCanDefineInstallmentAmount() {
		return canDefineInstallmentAmount;
	}
	public void setCanDefineInstallmentAmount(Boolean canDefineInstallmentAmount) {
		this.canDefineInstallmentAmount = canDefineInstallmentAmount;
	}
	public List<String> getPrincipalVariationsForBorrowerCycle() {
		return principalVariationsForBorrowerCycle;
	}
	public void setPrincipalVariationsForBorrowerCycle(List<String> principalVariationsForBorrowerCycle) {
		this.principalVariationsForBorrowerCycle = principalVariationsForBorrowerCycle;
	}
	public List<String> getInterestRateVariationsForBorrowerCycle() {
		return interestRateVariationsForBorrowerCycle;
	}
	public void setInterestRateVariationsForBorrowerCycle(List<String> interestRateVariationsForBorrowerCycle) {
		this.interestRateVariationsForBorrowerCycle = interestRateVariationsForBorrowerCycle;
	}
	public List<String> getNumberOfRepaymentVariationsForBorrowerCycle() {
		return numberOfRepaymentVariationsForBorrowerCycle;
	}
	public void setNumberOfRepaymentVariationsForBorrowerCycle(List<String> numberOfRepaymentVariationsForBorrowerCycle) {
		this.numberOfRepaymentVariationsForBorrowerCycle = numberOfRepaymentVariationsForBorrowerCycle;
	}
	public Boolean getCanUseForTopup() {
		return canUseForTopup;
	}
	public void setCanUseForTopup(Boolean canUseForTopup) {
		this.canUseForTopup = canUseForTopup;
	}
	public Boolean getIsRatesEnabled() {
		return isRatesEnabled;
	}
	public void setIsRatesEnabled(Boolean isRatesEnabled) {
		this.isRatesEnabled = isRatesEnabled;
	}
	public Boolean getMultiDisburseLoan() {
		return multiDisburseLoan;
	}
	public void setMultiDisburseLoan(Boolean multiDisburseLoan) {
		this.multiDisburseLoan = multiDisburseLoan;
	}
	public Boolean getHoldGuaranteeFunds() {
		return holdGuaranteeFunds;
	}
	public void setHoldGuaranteeFunds(Boolean holdGuaranteeFunds) {
		this.holdGuaranteeFunds = holdGuaranteeFunds;
	}
	public Boolean getAccountMovesOutOfNPAOnlyOnArrearsCompletion() {
		return accountMovesOutOfNPAOnlyOnArrearsCompletion;
	}
	public void setAccountMovesOutOfNPAOnlyOnArrearsCompletion(Boolean accountMovesOutOfNPAOnlyOnArrearsCompletion) {
		this.accountMovesOutOfNPAOnlyOnArrearsCompletion = accountMovesOutOfNPAOnlyOnArrearsCompletion;
	}
	public Boolean getSyncExpectedWithDisbursementDate() {
		return syncExpectedWithDisbursementDate;
	}
	public void setSyncExpectedWithDisbursementDate(Boolean syncExpectedWithDisbursementDate) {
		this.syncExpectedWithDisbursementDate = syncExpectedWithDisbursementDate;
	}
	public Boolean getIsEqualAmortization() {
		return isEqualAmortization;
	}
	public void setIsEqualAmortization(Boolean isEqualAmortization) {
		this.isEqualAmortization = isEqualAmortization;
	}
    
    
}

