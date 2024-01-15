package com.projet.banking.entities;

import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class SavingAccount implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3692313487386249522L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "account_no")
    private String accountNo;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "short_product_name")
    private String shortProductName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "status_id")
    private Status status;

    @ManyToOne
    @JoinColumn(name = "currency_code")
    private Currency currency;

    @Column(name = "account_balance")
    private double accountBalance;

    @ManyToOne
    @JoinColumn(name = "account_type_id")
    private AccountType accountType;

    @Embedded
    private Timeline timeline;

    @ManyToOne
    @JoinColumn(name = "sub_status_id")
    private SubStatus subStatus;

    @Column(name = "last_active_transaction_date")
    private int[] lastActiveTransactionDate;

    @ManyToOne
    @JoinColumn(name = "deposit_type_id")
    private DepositType depositType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getShortProductName() {
		return shortProductName;
	}

	public void setShortProductName(String shortProductName) {
		this.shortProductName = shortProductName;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Timeline getTimeline() {
		return timeline;
	}

	public void setTimeline(Timeline timeline) {
		this.timeline = timeline;
	}

	public SubStatus getSubStatus() {
		return subStatus;
	}

	public void setSubStatus(SubStatus subStatus) {
		this.subStatus = subStatus;
	}

	public int[] getLastActiveTransactionDate() {
		return lastActiveTransactionDate;
	}

	public void setLastActiveTransactionDate(int[] lastActiveTransactionDate) {
		this.lastActiveTransactionDate = lastActiveTransactionDate;
	}

	public DepositType getDepositType() {
		return depositType;
	}

	public void setDepositType(DepositType depositType) {
		this.depositType = depositType;
	}

    
}
