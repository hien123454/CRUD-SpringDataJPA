package com.example.TranNgocHien18049511CRUDSpringDataJPA;

import com.example.TranNgocHien18049511CRUDSpringDataJPA.entity.Customer;
import com.example.TranNgocHien18049511CRUDSpringDataJPA.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void getAll(){
        System.out.println("getAll: " + customerRepository.findAll());
    }
    @Test
    public void add() {
        Customer customer = Customer.builder().name("Hien nek").build();
        System.out.println("Them Customer: " + customerRepository.save(customer));
    }
    @Test
    public void update() {
        Customer customer = Customer.builder().id(1).name("Hien update").build();
        System.out.println("Update Customer: " + customerRepository.save(customer));
    }
    @Test
    public void delete() {
        customerRepository.deleteById(1);
    }
}
