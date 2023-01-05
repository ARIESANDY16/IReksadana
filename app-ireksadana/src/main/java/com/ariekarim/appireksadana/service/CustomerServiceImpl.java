package com.ariekarim.appireksadana.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ariekarim.appireksadana.Domain.Customer;
import com.ariekarim.appireksadana.dto.CustomerRequest;
import com.ariekarim.appireksadana.repository.CustomerRepository;

@Service
public class CustomerServiceImpl {
	
	@Autowired
	CustomerRepository repository;

	public Customer saveCustomer(CustomerRequest request) {
		Customer cust = new Customer(request);
		cust.setIdCustomer(UUID.randomUUID());
		this.repository.save(cust);
		
		return cust;
	}
	
	public List<Customer> getAllListCustomer() {
		List<Customer> customers = new ArrayList<>();
		repository.findAll().forEach(customers::add);
		return customers;
	}
	
	public List<Customer> getCustomerByCifNumber(String cifCustomer) {
		List<Customer> customers = new ArrayList<>();
		customers = this.repository.findByCifCustomer(cifCustomer);

		return customers;
	}
}
