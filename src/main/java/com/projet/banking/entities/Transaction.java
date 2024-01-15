package com.projet.banking.entities;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7693212697856523703L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "office_id")
	private int officeId;

	@Column(name = "office_name")
	private String officeName;

	@ManyToOne
	@JoinColumn(name = "type_id")
	private TransactionType type;
	
	@ManyToOne
	@JsonIgnore
	private UserBank userBank;

	private int[] date;

	@ManyToOne
	@JoinColumn(name = "currency_code")
	private Currency currency;

	private double amount;

	@Column(name = "submitted_on_date")
    private int[] submittedOnDate;

	private boolean reversed;

	
	public Transaction() {
		super();
	}

	public Transaction( int[] date, double amount, int[] submittedOnDate) {
		super();
		this.date = date;
		this.amount = amount;
		this.submittedOnDate = submittedOnDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOfficeId() {
		return officeId;
	}

	public void setOfficeId(int officeId) {
		this.officeId = officeId;
	}

	public String getOfficeName() {
		return officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public TransactionType getType() {
		return type;
	}

	public void setType(TransactionType type) {
		this.type = type;
	}

	

	public int[] getDate() {
		return date;
	}

	public void setDate(int[] date) {
		this.date = date;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	

	public int[] getSubmittedOnDate() {
		return submittedOnDate;
	}

	public void setSubmittedOnDate(int[] submittedOnDate) {
		this.submittedOnDate = submittedOnDate;
	}

	public boolean isReversed() {
		return reversed;
	}

	public void setReversed(boolean reversed) {
		this.reversed = reversed;
	}

	public UserBank getUserBank() {
		return userBank;
	}

	public void setUserBank(UserBank userBank) {
		this.userBank = userBank;
	}

}
