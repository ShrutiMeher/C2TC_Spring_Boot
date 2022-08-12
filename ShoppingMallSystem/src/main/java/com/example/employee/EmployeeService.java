package com.example.employee;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;

	public List<Employee> listAll() {
		return repo.findAll();
	}

	public Employee save(Employee employee) {
		repo.save(employee);
		return employee;
	}

	public Employee get(Integer id) {
		Employee employee = repo.findById(id).get();
		return employee;
	}

	public Employee delete(Integer id) {
		Employee employee = repo.findById(id).get();
		repo.deleteById(id);
		return employee;
	}
}
