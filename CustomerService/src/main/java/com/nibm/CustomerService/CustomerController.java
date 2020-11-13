
package com.nibm.CustomerService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {
    
    @Autowired
    private CustomerRepository customerRepository; 
    
    @CrossOrigin(origins="*")
    @GetMapping(path = "/customers/{userReferenceId}")
    public Customer getUserByRef(@PathVariable String userReferenceId){
        return customerRepository.findByUserReferenceId(userReferenceId);
    }  
    @CrossOrigin(origins = "*")     
    @GetMapping(path = "/customers")
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
    
     @CrossOrigin(origins="*")
  @PostMapping(path = "/customers")
    public Customer createUser(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
    
     @CrossOrigin(origins="*")
     @PutMapping(path = "/customers/{id}")
    public void updateUser(@PathVariable int id, @RequestBody Customer customer){
        customer.setId(id);
        customerRepository.save(customer);
    }
    
    @CrossOrigin(origins = "*")
    @DeleteMapping("customers/{id}")
    public void get(@PathVariable int id) {
        customerRepository.deleteById(id);
    }
    
 
}
