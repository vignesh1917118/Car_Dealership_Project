package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Car;
import com.project.model.Customer;
import com.project.service.CarService;
import com.project.service.CustomerService;

@RestController
@RequestMapping("/api2")
public class CustomerController {
	
	@Autowired
    CustomerService customerService;
	
	  @RequestMapping("/hello")
	    public String sayHello() {
	        return("Hey Badavar Maklu ");
	    }

	    @GetMapping("/findCustomerById/{id}")
	    public Customer getCustomerById(@PathVariable Long id) {
	       return customerService.getCustomerById(id);

	   }

	    @DeleteMapping("/deleteCustomerById/{id}")
	    public void deleteCarById(@PathVariable Long id) {
	        customerService.deleteCustomerById(id);
	        System.out.println(id +"Sucessfully deleted");
	    }

	   @GetMapping("/AllCustomer")
	    public List<Customer> getAllCustomer(){
	        return customerService.getAllCustomer();
	    }
	   
	    @PostMapping("/insertCustomer")
	    public Customer create(@RequestBody  Customer customer ) {
	        return customerService.create(customer);
	    }
	   

}
