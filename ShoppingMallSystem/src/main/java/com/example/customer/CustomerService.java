package com.example.customer;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CustomerService {
	
	@Autowired
	private CustomerRepository repo;

	public List<Customer> listAll() {
		return repo.findAll();
	}

	public Customer save(Customer customer) {
		repo.save(customer);
		return customer;
	}

	public Customer get(Integer id) {
		Customer customer = repo.findById(id).get();
		return customer;
	}

	public Customer delete(Integer id) {
		Customer customer = repo.findById(id).get();
		repo.deleteById(id);
		return customer;
	}
}