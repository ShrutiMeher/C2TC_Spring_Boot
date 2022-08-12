package com.example.orderdetails;


import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
@RestController
public class OrderDetailsController 
{
 @Autowired
 private OrderDetailsService service;
 
 // RESTful API methods for Retrieval operations
 @GetMapping("/orders")
 public List<OrderDetails> list() 
 {
 return service.listAll();
 }
 @GetMapping("/orders/{id}")
 public ResponseEntity<OrderDetails> get(@PathVariable Integer id) 
 {
 try
 {
 OrderDetails order = service.get(id);
 return new ResponseEntity<OrderDetails>(order, HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<OrderDetails>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Create operation
 @PostMapping("/orders")
 public void add(@RequestBody OrderDetails order) 
 {
 service.save(order);
 }
 
 // RESTful API method for Update operation
 @PutMapping("/orders/{id}")
 public ResponseEntity<?> update(@RequestBody OrderDetails order, @PathVariable Integer id) 
 {
 try
 {
 OrderDetails existOrder = service.get(id);
 service.save(order);
 return new ResponseEntity<>(HttpStatus.OK);
 } 
 catch (NoSuchElementException e) 
 {
 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
 } 
 }
 // RESTful API method for Delete operation
 @DeleteMapping("/orders/{id}")
 public void delete(@PathVariable Integer id) 
 {
 service.delete(id);
 }
}
