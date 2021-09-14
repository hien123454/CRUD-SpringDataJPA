package com.example.TranNgocHien18049511CRUDSpringDataJPA.repository;

import com.example.TranNgocHien18049511CRUDSpringDataJPA.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
