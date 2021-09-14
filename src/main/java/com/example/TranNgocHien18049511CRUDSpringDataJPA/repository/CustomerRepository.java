package com.example.TranNgocHien18049511CRUDSpringDataJPA.repository;

import com.example.TranNgocHien18049511CRUDSpringDataJPA.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    List<Customer> findByName(String name);
}
