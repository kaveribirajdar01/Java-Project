package com.nursery.Service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.nursery.entity.Customer;

@Service
public interface CustomerService {

	
	public List<Customer> findCustomerById(int id);
	public List<Customer> findAllCustomer();
	public void deleteCustomer(int id);
	public Customer updateCustomer(Customer customer);
	public Customer addCustomer(Customer customer);
}
