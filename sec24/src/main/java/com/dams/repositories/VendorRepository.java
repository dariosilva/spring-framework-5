package com.dams.repositories;

import com.dams.domain.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository  extends JpaRepository<Vendor, Long> {
}
