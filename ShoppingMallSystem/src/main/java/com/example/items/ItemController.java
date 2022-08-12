package com.example.items;

import java.util.NoSuchElementException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class ItemController 
{
 @Autowired
 private ItemService service;
private Item item;
 
 // RESTful API methods for Retrieval operations
 @GetMapping("/items")
 public java.util.List<Item> list() 
 {
 return service.listAll();
 }
 @GetMapping("/item/{id}")
 public ResponseEntity<Item> get(@PathVariable Integer id) 
 {
 try
 {
 Item item = service.get(id);
 return new ResponseEntity<Item>(item, HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<Item>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Create operation
 @PostMapping("/items")
 public void add(@RequestBody Item product) 
 {
	 service.save(item);
 }
 
 // RESTful API method for Update operation
 @PutMapping("/items/{id}")
 public ResponseEntity<?> update(@RequestBody Item item, @PathVariable Integer id) 
 {
 try
 {
 Item existItem = service.get(id);
 service.save(item);
 return new ResponseEntity<>(HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Delete operation
 @DeleteMapping("/items/{id}")
 public void delete(@PathVariable Integer id) 
 {
 service.delete(id);
 }
	
	

}
