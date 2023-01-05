package com.ariekarim.appireksadana.dto;

public class CustomerRequest {
	
	private Long cifCustomer;
	private String firstNameCustomer;
	private String middleNameCustomer;
	private String lastNameCustomer;
	
	public CustomerRequest() {
		this.cifCustomer = null;
		this.firstNameCustomer = null;
		this.middleNameCustomer = null;
		this.lastNameCustomer = null;
	}
	public Long getCifCustomer() {
		return cifCustomer;
	}
	public void setCifCustomer(Long cifCustomer) {
		this.cifCustomer = cifCustomer;
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
