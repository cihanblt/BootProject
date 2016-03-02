package com.cb.Repository;

import com.cb.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by cihan on 2.03.2016.
 */
//@Repository
@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer,Long>{
    public Collection<Customer> findByName(String name);
}
