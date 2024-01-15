package com.projet.banking.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Timeline {
	@Column(name = "submitted_on_date")
    private int[] submittedOnDate;

    @Column(name = "submitted_by_username")
    private String submittedByUsername;

    @Column(name = "submitted_by_firstname")
    private String submittedByFirstname;

    @Column(name = "submitted_by_lastname")
    private String submittedByLastname;

    @Column(name = "approved_on_date")
    private int[] approvedOnDate;

    @Column(name = "approved_by_username")
    private String approvedByUsername;

    @Column(name = "approved_by_firstname")
    private String approvedByFirstname;

    @Column(name = "approved_by_lastname")
    private String approvedByLastname;

    @Column(name = "expected_disbursement_date")
    private int[] expectedDisbursementDate;

	public int[] getSubmittedOnDate() {
		return submittedOnDate;
	}

	public void setSubmittedOnDate(int[] submittedOnDate) {
		this.submittedOnDate = submittedOnDate;
	}

	public String getSubmittedByUsername() {
		return submittedByUsername;
	}

	public void setSubmittedByUsername(String submittedByUsername) {
		this.submittedByUsername = submittedByUsername;
	}

	public String getSubmittedByFirstname() {
		return submittedByFirstname;
	}

	public void setSubmittedByFirstname(String submittedByFirstname) {
		this.submittedByFirstname = submittedByFirstname;
	}

	public String getSubmittedByLastname() {
		return submittedByLastname;
	}

	public void setSubmittedByLastname(String submittedByLastname) {
		this.submittedByLastname = submittedByLastname;
	}

	public int[] getApprovedOnDate() {
		return approvedOnDate;
	}

	public void setApprovedOnDate(int[] approvedOnDate) {
		this.approvedOnDate = approvedOnDate;
	}

	public String getApprovedByUsername() {
		return approvedByUsername;
	}

	public void setApprovedByUsername(String approvedByUsername) {
		this.approvedByUsername = approvedByUsername;
	}

	public String getApprovedByFirstname() {
		return approvedByFirstname;
	}

	public void setApprovedByFirstname(String approvedByFirstname) {
		this.approvedByFirstname = approvedByFirstname;
	}

	public String getApprovedByLastname() {
		return approvedByLastname;
	}

	public void setApprovedByLastname(String approvedByLastname) {
		this.approvedByLastname = approvedByLastname;
	}

	public int[] getExpectedDisbursementDate() {
		return expectedDisbursementDate;
	}

	public void setExpectedDisbursementDate(int[] expectedDisbursementDate) {
		this.expectedDisbursementDate = expectedDisbursementDate;
	}
    
    
}
