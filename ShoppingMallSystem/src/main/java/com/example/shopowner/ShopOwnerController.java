package com.example.shopowner;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//import com.example.shopowner.ShopOwner;
//import com.example.shopowner.ShopOwnerService;

public class ShopOwnerController {

	private static final HttpStatus ShopOwnersponseEntity = null;
	@Autowired
	private ShopOwnerService service;
	@GetMapping("/ShopOwner")
	 public List<ShopOwner> list() 
	 {
	 return service.listAll();
	 }
	 @GetMapping("/ShopOwner/{id}")
	 public ResponseEntity<ShopOwner> get(@PathVariable Long id) 
	 {
	 try
	 {
		 ShopOwner ShopOwner = service.get(id);
	 return new ResponseEntity<ShopOwner>(ShopOwner, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<ShopOwner>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Create operation
	 @PostMapping("/ShopOwner")
	 public void add(@RequestBody ShopOwner ShopOwner) 
	 {
	
	service.save(ShopOwner);
	 }
	 
	 // RESTful API method for Update operation
	 @PutMapping("/ShopOwner/{id}")
	 public ResponseEntity<?> update(@RequestBody ShopOwner ShopOwner, @PathVariable Long id) 
	 {
	 try
	 {
		 
		 service.save(ShopOwner);
		 return new ResponseEntity<>(HttpStatus.OK);
		 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Delete operation
	 @DeleteMapping("/ShopOwner/{id}")
	 public void delete(@PathVariable Long id) 
	 {
	 service.delete(id);
	 }
	public static HttpStatus getShopownersponseentity() {
		return ShopOwnersponseEntity;
	}
}
