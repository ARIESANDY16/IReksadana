package com.ariekarim.appireksadana.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ariekarim.appireksadana.Domain.Customer;
import com.ariekarim.appireksadana.dto.APIResult;
import com.ariekarim.appireksadana.dto.CustomerRequest;
import com.ariekarim.appireksadana.service.CustomerService;
import com.ariekarim.appireksadana.util.ErrorCode;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	APIResult result = new APIResult();
	ErrorCode errCode = ErrorCode.CUSTOMER_MANDATORY_FIELD;
	
	@RequestMapping(value = {"/custRegistration"}, method = {RequestMethod.POST})
	public APIResult createRegisterCustomer(@RequestBody CustomerRequest request) {
		if(request.getCifCustomer() == null || request.getCifCustomer().equals("")) {
			result = new APIResult(errCode);
		} else if(request.getFirstNameCustomer() == null || request.getFirstNameCustomer().equals("")) {
			result = new APIResult(errCode);
		} else {
			try {
				this.customerService.customerRegister(request);
			} catch(Exception e){
				System.out.println(e.getMessage());
				errCode = ErrorCode.COMMON_ERROR;
				result = new APIResult(errCode);
			}
		}
		return result;
	}
	
	@RequestMapping("/getAllCustomers")
	public List<Customer> createTodo(){
		return customerService.getAllListCustomer();
	}
	
	@RequestMapping(method= {RequestMethod.DELETE}, value= {"/deleteCustomerById/{id}"})
	public void deleteCustomer(@PathVariable Long id) {
		this.customerService.deleteCustomer(id);
	}
	
	@RequestMapping("/customers/{cifCustomer}")
	public List<Customer> getCustomer(@PathVariable String cifCustomer) {
		return this.customerService.getCustomerByCifNumber(cifCustomer);
	}

}
