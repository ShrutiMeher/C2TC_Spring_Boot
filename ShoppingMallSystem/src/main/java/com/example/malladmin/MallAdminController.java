package com.example.malladmin;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MallAdminController {
	
	@Autowired
	private MallAdminService service;
	private MallAdmin malladmin;
	
	@GetMapping("/malladmin")
	public java.util.List<MallAdmin>list()
	{
		return service.listAll();
	}

	 @GetMapping("/malladmin/{id}")
	 public ResponseEntity<MallAdmin> get(@PathVariable Integer id) 
	 {
	 try
	 {
	 MallAdmin malladmin = service.get(id);
	 return new ResponseEntity<MallAdmin>(malladmin, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<MallAdmin>(HttpStatus.NOT_FOUND);
	 } 
	 }
	
	 // RESTful API method for Create operation
	 @PostMapping("/malladmin")
	 public void add(@RequestBody MallAdmin malladmin) 
	 {
		 service.save(malladmin);
	 }
	
	// RESTful API method for Update operation
	 @PutMapping("/malladmin/{id}")
	 public ResponseEntity<?> update(@RequestBody MallAdmin malladmin, @PathVariable Integer id) 
	 {
	 try
	 {
	 MallAdmin malladmin1 = service.get(id);
	 service.save(malladmin1);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 
	// RESTful API method for Delete operation
	 @DeleteMapping("/malladmin/{id}")
	 public void delete(@PathVariable Long id) 
	 {
	 service.delete(id);
	 }
	 
	 
}
