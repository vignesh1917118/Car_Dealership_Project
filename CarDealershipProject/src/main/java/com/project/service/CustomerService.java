package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Car;
import com.project.model.Customer;
import com.project.repository.CarRepository;
import com.project.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository csr;
	
	public Customer getCustomerById(Long id) {
		return csr.findById(id).get();
	}

	public List<Customer> getAllCustomer() {

		return csr.findAll();
	}

	public void deleteCustomerById(Long id) {
		
		csr.deleteById(id);
	}

	public Customer create(Customer customer) {
		return csr.save(customer);
	}
	
	

}
