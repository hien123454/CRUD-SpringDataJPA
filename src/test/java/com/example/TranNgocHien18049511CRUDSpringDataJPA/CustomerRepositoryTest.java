package com.example.TranNgocHien18049511CRUDSpringDataJPA;

import com.example.TranNgocHien18049511CRUDSpringDataJPA.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CustomerRepositoryTest {
    @Autowired
    private CustomerRepository customerRepository;
    @Test
    public void getAll() {
        System.out.println("getAll: " + customerRepository.getAll());
    }
    @Test
    public void add() {
        customerRepository.addCustomer("Hien jpql");
    }
    @Test
    public void update() {
        customerRepository.updateCustomer(1, "hien jpql update ");
    }
    @Test
    public void delete() {
        customerRepository.deleteCustomerById(1);
    }
}
