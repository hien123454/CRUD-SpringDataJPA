package com.example.TranNgocHien18049511CRUDSpringDataJPA.repository;

import com.example.TranNgocHien18049511CRUDSpringDataJPA.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query("select p from Customer p")
    List<Customer> getAll();

    @Transactional
    @Modifying
    @Query(value = "insert into customer(name) values(?1)", nativeQuery = true)
    void addCustomer(String name);

    @Transactional
    @Modifying
    @Query(value = "update Customer p set p.name = ?2 where p.id = ?1")
    void updateCustomer(Integer id, String name);

    @Transactional
    @Modifying
    @Query("delete from Customer p where p.id = ?1")
    void deleteCustomerById(Integer id);
}
