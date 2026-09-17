package com.anto.springbootapp.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.anto.springbootapp.model.Customer;
import com.anto.springbootapp.repository.CustomerRepository;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(CustomerRepository repository) {
        return args -> {
            repository.save(new Customer("Jack", "Bauer"));
            repository.save(new Customer("Chloe", "O'Brian"));
            repository.save(new Customer("Kim", "Bauer"));
            repository.save(new Customer("David", "Palmer"));
            repository.save(new Customer("Michelle", "Dessler"));
        };
    }
}
