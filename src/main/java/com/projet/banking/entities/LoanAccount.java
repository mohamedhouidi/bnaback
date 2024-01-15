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
public class LoanAccount implements Serializable{
	 /**
	 * 
	 */
	private static final long serialVersionUID = -6527284486836791452L;

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
	    @JoinColumn(name = "loan_type_id")
	    private LoanType loanType;

	    @Embedded
	    private Timeline timeline;

	    private boolean inArrears;

	    @Column(name = "original_loan")
	    private double originalLoan;

	    @Column(name = "loan_balance")
	    private double loanBalance;

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

		public LoanType getLoanType() {
			return loanType;
		}

		public void setLoanType(LoanType loanType) {
			this.loanType = loanType;
		}

		public Timeline getTimeline() {
			return timeline;
		}

		public void setTimeline(Timeline timeline) {
			this.timeline = timeline;
		}

		public boolean isInArrears() {
			return inArrears;
		}

		public void setInArrears(boolean inArrears) {
			this.inArrears = inArrears;
		}

		public double getOriginalLoan() {
			return originalLoan;
		}

		public void setOriginalLoan(double originalLoan) {
			this.originalLoan = originalLoan;
		}

		public double getLoanBalance() {
			return loanBalance;
		}

		public void setLoanBalance(double loanBalance) {
			this.loanBalance = loanBalance;
		}
	    
	    
	    

	    
	}

