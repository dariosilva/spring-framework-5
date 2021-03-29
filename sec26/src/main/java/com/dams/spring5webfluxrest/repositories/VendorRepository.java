package com.dams.spring5webfluxrest.repositories;

import com.dams.spring5webfluxrest.domain.Vendor;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by jt on 12/23/17.
 */
public interface VendorRepository extends ReactiveMongoRepository<Vendor, String> {
}
