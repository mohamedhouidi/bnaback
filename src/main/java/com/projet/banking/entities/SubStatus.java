package com.projet.banking.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SubStatus implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = -6049351575239851630L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String code;
    private String value;

    @Column(name = "is_none")
    private boolean none;

    @Column(name = "is_inactive")
    private boolean inactive;

    @Column(name = "is_dormant")
    private boolean dormant;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean isNone() {
		return none;
	}

	public void setNone(boolean none) {
		this.none = none;
	}

	public boolean isInactive() {
		return inactive;
	}

	public void setInactive(boolean inactive) {
		this.inactive = inactive;
	}

	public boolean isDormant() {
		return dormant;
	}

	public void setDormant(boolean dormant) {
		this.dormant = dormant;
	}

  
}
