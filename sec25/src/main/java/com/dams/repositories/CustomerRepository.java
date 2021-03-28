package com.dams.repositories;

import com.dams.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by jt on 9/27/17.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long>{
}
