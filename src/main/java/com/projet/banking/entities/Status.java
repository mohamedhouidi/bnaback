package com.projet.banking.entities;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Status implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7582226782303358769L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;

	private String code;
	private String value;

	@Column(name = "pending_approval")
	private boolean pendingApproval;

	@Column(name = "waiting_for_disbursal")
	private boolean waitingForDisbursal;

	private boolean active;
	
	@OneToMany(fetch = FetchType.EAGER, targetEntity = LoanAccount.class)
	@JoinColumn(name = "status_id")
	@JsonIgnore
	private List<LoanAccount> loanAccounts;
	
	@OneToMany(fetch = FetchType.EAGER, targetEntity = SavingAccount.class)
	@JoinColumn(name = "status_id")
	@JsonIgnore
	private List<SavingAccount> savingAccounts;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public boolean isPendingApproval() {
		return pendingApproval;
	}

	public void setPendingApproval(boolean pendingApproval) {
		this.pendingApproval = pendingApproval;
	}

	public boolean isWaitingForDisbursal() {
		return waitingForDisbursal;
	}

	public void setWaitingForDisbursal(boolean waitingForDisbursal) {
		this.waitingForDisbursal = waitingForDisbursal;
	}

	public List<LoanAccount> getLoanAccounts() {
		return loanAccounts;
	}

	public void setLoanAccounts(List<LoanAccount> loanAccounts) {
		this.loanAccounts = loanAccounts;
	}

	public List<SavingAccount> getSavingAccounts() {
		return savingAccounts;
	}

	public void setSavingAccounts(List<SavingAccount> savingAccounts) {
		this.savingAccounts = savingAccounts;
	}

	

}
