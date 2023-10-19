package com.example.dbboot.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dbboot.entity.Vendor;
@Repository
public interface VendorRepo extends JpaRepository<Vendor, String> {

}
