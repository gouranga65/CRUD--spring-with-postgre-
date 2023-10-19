package com.example.dbboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dbboot.entity.Vendor;

@Component
public class Vendorservice {
    @Autowired
    private VendorRepo repo;

    // Read all vendors - Return a internal table
    public List<Vendor> getAllVendors() {
        return repo.findAll();
    }

    // Read single vendor by KEY - READ TABLE itab WITH KEY
    public Optional<Vendor> readVendorById(String vendorId) {
        return repo.findById(vendorId);
    }

    // Add new record to vendors - APPEND wa to ITAB
    public Vendor addVendor(Vendor newVendor) {
        return repo.save(newVendor);
    }

    public Vendor updateVendorById(String vendorId, Vendor vendorData) {
        Optional<Vendor> vendId = repo.findById(vendorId);
        return repo.save(vendorData);

    }

    public String deleteVendor(String vendorId) {
        repo.deleteById(vendorId);
        return "done";
    }

}
