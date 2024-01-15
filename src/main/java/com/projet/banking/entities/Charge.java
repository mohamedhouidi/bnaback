package com.projet.banking.entities;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Charge implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7091230476860818920L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "client_id")
    private int clientId;

    @Column(name = "charge_id")
    private int chargeId;

    private String name;

    @ManyToOne
    @JoinColumn(name = "charge_time_type_id")
    private ChargeTimeType chargeTimeType;

    @Column(name = "due_date")
    private int[] dueDate;

    @ManyToOne
    @JoinColumn(name = "charge_calculation_type_id")
    private ChargeCalculationType chargeCalculationType;

    @ManyToOne
    @JoinColumn(name = "currency_code")
    private Currency currency;

    private double amount;

    @Column(name = "amount_paid")
    private double amountPaid;

    @Column(name = "amount_waived")
    private double amountWaived;

    @Column(name = "amount_written_off")
    private double amountWrittenOff;

    @Column(name = "amount_outstanding")
    private double amountOutstanding;

    private boolean penalty;

    @Column(name = "is_active")
    private boolean isActive;

    @Column(name = "is_paid")
    private boolean isPaid;

    @Column(name = "is_waived")
    private boolean isWaived;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public int getChargeId() {
		return chargeId;
	}

	public void setChargeId(int chargeId) {
		this.chargeId = chargeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ChargeTimeType getChargeTimeType() {
		return chargeTimeType;
	}

	public void setChargeTimeType(ChargeTimeType chargeTimeType) {
		this.chargeTimeType = chargeTimeType;
	}

	public int[] getDueDate() {
		return dueDate;
	}

	public void setDueDate(int[] dueDate) {
		this.dueDate = dueDate;
	}

	public ChargeCalculationType getChargeCalculationType() {
		return chargeCalculationType;
	}

	public void setChargeCalculationType(ChargeCalculationType chargeCalculationType) {
		this.chargeCalculationType = chargeCalculationType;
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

	public double getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(double amountPaid) {
		this.amountPaid = amountPaid;
	}

	public double getAmountWaived() {
		return amountWaived;
	}

	public void setAmountWaived(double amountWaived) {
		this.amountWaived = amountWaived;
	}

	public double getAmountWrittenOff() {
		return amountWrittenOff;
	}

	public void setAmountWrittenOff(double amountWrittenOff) {
		this.amountWrittenOff = amountWrittenOff;
	}

	public double getAmountOutstanding() {
		return amountOutstanding;
	}

	public void setAmountOutstanding(double amountOutstanding) {
		this.amountOutstanding = amountOutstanding;
	}

	public boolean isPenalty() {
		return penalty;
	}

	public void setPenalty(boolean penalty) {
		this.penalty = penalty;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public boolean isPaid() {
		return isPaid;
	}

	public void setPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}

	public boolean isWaived() {
		return isWaived;
	}

	public void setWaived(boolean isWaived) {
		this.isWaived = isWaived;
	}
    
    
    

}
