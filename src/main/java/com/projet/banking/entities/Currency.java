package com.projet.banking.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Currency implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -8030557310542091940L;

	@Id
    private String code;

    private String name;

    @Column(name = "decimal_places")
    private int decimalPlaces;

    @Column(name = "in_multiples_of")
    private int inMultiplesOf;

    @Column(name = "name_code")
    private String nameCode;

    @Column(name = "display_label")
    private String displayLabel;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDecimalPlaces() {
		return decimalPlaces;
	}

	public void setDecimalPlaces(int decimalPlaces) {
		this.decimalPlaces = decimalPlaces;
	}

	public int getInMultiplesOf() {
		return inMultiplesOf;
	}

	public void setInMultiplesOf(int inMultiplesOf) {
		this.inMultiplesOf = inMultiplesOf;
	}

	public String getNameCode() {
		return nameCode;
	}

	public void setNameCode(String nameCode) {
		this.nameCode = nameCode;
	}

	public String getDisplayLabel() {
		return displayLabel;
	}

	public void setDisplayLabel(String displayLabel) {
		this.displayLabel = displayLabel;
	}

   
}
