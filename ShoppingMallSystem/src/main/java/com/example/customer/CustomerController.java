package com.example.customer;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;


@RestController
public class CustomerController {

	
@Autowired
private CustomerService service;

//RESTful API methods for Retrieval operations

	@GetMapping("/customers")
	public List<Customer> list() {
		return service.listAll();
	}

	@GetMapping("/customers/{id}")
	public ResponseEntity<Customer> get(@PathVariable Integer id) {
		try {
			Customer customer = service.get(id);
			return new ResponseEntity<Customer>(customer, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Create operation
	@PostMapping("/customers")
	public void add(@RequestBody Customer customer) {
		service.save(customer);
	}


	// RESTful API method for Update operation
	@PutMapping("/customers/{id}")
	public ResponseEntity<?> update(@RequestBody Customer customer, @PathVariable Integer id) {
		try {
			service.save(customer);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	// RESTful API method for Delete operation
	@DeleteMapping("/customers/{id}")
	public void delete(@PathVariable Integer id) {
		service.delete(id);
	}


}
