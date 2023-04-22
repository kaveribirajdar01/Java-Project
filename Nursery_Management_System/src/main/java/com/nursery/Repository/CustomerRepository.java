package com.nursery.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nursery.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Integer>{

	public List<Customer> findCustomerByCId(int id);
}
