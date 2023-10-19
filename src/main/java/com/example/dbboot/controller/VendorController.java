package com.example.dbboot.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dbboot.entity.Vendor;
import com.example.dbboot.service.Vendorservice;

@RestController
public class VendorController {
    @Autowired
    private Vendorservice myVendorSrv;

    @GetMapping("/okie")
    public List<Vendor> getAll() {
        return myVendorSrv.getAllVendors();
    }

    @PostMapping("/posting")
    public Vendor createVendor(@RequestBody Vendor vendor) {
        return myVendorSrv.addVendor(vendor);
    }
}
