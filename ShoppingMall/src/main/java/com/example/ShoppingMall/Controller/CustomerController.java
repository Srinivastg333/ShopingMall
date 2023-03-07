package com.example.ShoppingMall.Controller;

import com.example.ShoppingMall.Modules.CustomerDT;
import com.example.ShoppingMall.Services.CustomerDTServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("api/V3")
public class CustomerController {

    @Autowired
    CustomerDTServices customerDTServices;


    @PostMapping("/users")
    public ResponseEntity<CustomerDT> createCustomer(@RequestBody CustomerDT customerDT) {
        return new ResponseEntity<>(customerDTServices.registrationCustomer(customerDT), HttpStatus.CREATED);
    }
    @GetMapping("/users")
    public List<CustomerDT> getAllCustomers(){
        return customerDTServices.getAllRegistration();

    }
    @PutMapping("/users/{id}")
    public ResponseEntity<CustomerDT> EditCustomer(@PathVariable("id") Integer id, @RequestBody CustomerDT customerDT) {
        return ResponseEntity.ok(customerDTServices.EditProfile(customerDT,id));
    }
}
