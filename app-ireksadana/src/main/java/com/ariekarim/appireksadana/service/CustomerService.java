package com.ariekarim.appireksadana.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ariekarim.appireksadana.Domain.Customer;
import com.ariekarim.appireksadana.dto.CustomerRequest;
import com.ariekarim.appireksadana.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerServiceImpl service;
	
	@Autowired
	CustomerRepository repo;
	
	public Customer customerRegister(CustomerRequest request) {
		return this.service.saveCustomer(request);
	}
	
	public List<Customer> getAllListCustomer() {
		return this.service.getAllListCustomer();
	}
	
	public void deleteCustomer(Long id) {
		repo.deleteById(id);
	}
	
	public List<Customer> getCustomerByCifNumber(Long cifCustomer) {
		return this.service.getCustomerByCifNumber(cifCustomer);
	}

}
