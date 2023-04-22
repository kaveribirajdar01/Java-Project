package com.nursery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nursery.Service.CustomerService;
import com.nursery.entity.Customer;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;
	
	@PostMapping(value="/customer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return customerService.addCustomer(customer);
		
	}
	
	@GetMapping(value="/customer")
	public List<Customer> getAllCustomer()
	{
		return customerService.findAllCustomer();
		
	}
	
	@GetMapping(value="/customer/{id}")
	public List<Customer> findCustomerById(@PathVariable int id)
	{
		return customerService.findCustomerById(id);	
	}
	
	@DeleteMapping(value="/customer/{id}")
	public String deleteCustomer(@PathVariable int id)
	{
		customerService.deleteCustomer(id);
		return "Customer Deleted";	
	}
	
	@PutMapping(value="/customer/{id}")
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		return customerService.updateCustomer(customer);	
	}
}
