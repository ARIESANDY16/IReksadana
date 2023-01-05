package com.ariekarim.appireksadana.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.ariekarim.appireksadana.Domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	@Nullable
	public List<Customer> findByCifCustomer(Long cifCustomer);
	
}
