package com.example.dbboot.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.dbboot.entity.Vendor;

@Repository
public interface VendorRepo extends JpaRepository<Vendor, String> {
    List<Vendor> findByCompanyName(String companyName);

    @Query(nativeQuery = true, value = "select * from public.vendor where email like %?1%")
    List<Vendor> lookUpVendorByEmailId(String email);
}
