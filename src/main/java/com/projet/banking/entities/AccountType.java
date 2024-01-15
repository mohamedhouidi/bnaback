package com.projet.banking.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AccountType implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 8802344917361982415L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private int id;

    public AccountType() {
		super();
	}
	public AccountType(int id, String code, String value) {
		super();
		this.id = id;
		this.code = code;
		this.value = value;
	}
	private String code;
    private String value;
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

   
}
