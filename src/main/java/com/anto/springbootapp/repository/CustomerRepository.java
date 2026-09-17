package com.anto.springbootapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anto.springbootapp.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
