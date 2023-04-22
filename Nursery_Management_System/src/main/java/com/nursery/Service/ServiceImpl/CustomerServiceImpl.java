package com.nursery.Service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nursery.Repository.CustomerRepository;
import com.nursery.Service.CustomerService;
import com.nursery.entity.Customer;

@Repository
public class CustomerServiceImpl implements CustomerService{


	@Autowired
	CustomerRepository customerRepository;


	@Override
	public List<Customer> findCustomerById(int id) {
		// TODO Auto-generated method stub
		return customerRepository.findCustomerByCId(id);
	}

	@Override
	public List<Customer> findAllCustomer() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		customerRepository.deleteById(id);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		Customer _customer=customerRepository.findById(customer.getCId()).get();
		_customer.setCId(customer.getCId());
		_customer.setCName(customer.getCName());
		customerRepository.save(_customer);
		return _customer; 
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}

}
