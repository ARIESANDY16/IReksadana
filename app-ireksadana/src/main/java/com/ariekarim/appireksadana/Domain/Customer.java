package com.ariekarim.appireksadana.Domain;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ariekarim.appireksadana.dto.CustomerRequest;

@Entity
@Table(name = "customer")
public class Customer {
	
	@Id
	private UUID idCustomer;
	private String cifCustomer;
	private String emailCustomer;
	private String firstNameCustomer;
	private String middleNameCustomer;
	private String lastNameCustomer;
	private String genderCustomer;
	private String identityNumberCustomer;
	
	public Customer(){
		
	}
	
	public Customer(CustomerRequest dto) {
		this.cifCustomer = dto.getCifCustomer();
		this.firstNameCustomer = dto.getFirstNameCustomer();
		this.middleNameCustomer = dto.getMiddleNameCustomer();
		this.lastNameCustomer = dto.getLastNameCustomer();
	}
	
	public UUID getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(UUID idCustomer) {
		this.idCustomer = idCustomer;
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
	public String getEmailCustomer() {
		return emailCustomer;
	}
	public void setEmailCustomer(String emailCustomer) {
		this.emailCustomer = emailCustomer;
	}
	public String getCifCustomer() {
		return cifCustomer;
	}
	public void setCifCustomer(String cifCustomer) {
		this.cifCustomer = cifCustomer;
	}
	public String getGenderCustomer() {
		return genderCustomer;
	}
	public void setGenderCustomer(String genderCustomer) {
		this.genderCustomer = genderCustomer;
	}
	public String getIdentityNumberCustomer() {
		return identityNumberCustomer;
	}
	public void setIdentityNumberCustomer(String identityNumberCustomer) {
		this.identityNumberCustomer = identityNumberCustomer;
	}

}
