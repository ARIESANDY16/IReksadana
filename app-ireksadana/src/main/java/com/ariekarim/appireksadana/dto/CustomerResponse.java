package com.ariekarim.appireksadana.dto;

import java.util.UUID;

import com.ariekarim.appireksadana.Domain.Customer;

public class CustomerResponse {
	private UUID idCustomer;
	private String cifNumberCustomer;
	private String firstNameCustomer;
	private String middleNameCustomer;
	private String lastNameCustomer;
	
	public CustomerResponse() {
		this.idCustomer = null;
		this.cifNumberCustomer = null;
		this.firstNameCustomer = null;
		this.middleNameCustomer = null;
		this.lastNameCustomer = null;
	}

	public CustomerResponse(Customer entity) {
		this.idCustomer = entity.getIdCustomer();
		this.cifNumberCustomer = entity.getCifCustomer();
		this.firstNameCustomer = entity.getFirstNameCustomer();
		this.middleNameCustomer = entity.getMiddleNameCustomer();
		this.lastNameCustomer = entity.getLastNameCustomer();
	}

	public UUID getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(UUID idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getCifNumberCustomer() {
		return cifNumberCustomer;
	}

	public void setCifNumberCustomer(String cifNumberCustomer) {
		this.cifNumberCustomer = cifNumberCustomer;
	}

	public String getFirstNameCustomer() {
		return firstNameCustomer;
	}

	public void setFirstNameCustomer(String firstNameCustomer) {
		this.firstNameCustomer = firstNameCustomer;
	}

	public String getMiddleNameCustomer() {
		return middleNameCustomer;
	}

	public void setMiddleNameCustomer(String middleNameCustomer) {
		this.middleNameCustomer = middleNameCustomer;
	}

	public String getLastNameCustomer() {
		return lastNameCustomer;
	}

	public void setLastNameCustomer(String lastNameCustomer) {
		this.lastNameCustomer = lastNameCustomer;
	}

}
