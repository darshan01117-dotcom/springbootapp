package com.anto.springbootapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anto.springbootapp.model.Customer;
import com.anto.springbootapp.repository.CustomerRepository;

@RestController
public class CustomerController {

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(@RequestParam(required = false) String lastName) {
        if (lastName != null && !lastName.isBlank()) {
            return repository.findByLastName(lastName);
        }

        return repository.findAll();
    }
}
