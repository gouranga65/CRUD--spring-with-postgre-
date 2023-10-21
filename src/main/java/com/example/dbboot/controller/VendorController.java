package com.example.dbboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("okie/{id}")
    public Object getByid(@PathVariable("id") String id) {
        return myVendorSrv.readVendorById(id);
    }

    @DeleteMapping("deleteVEND/{id}")
    public Object deleteVendor(@PathVariable("id") String id) {
        return myVendorSrv.deleteVendor(id);
    }

    @PutMapping("updateData/{id}")
    public Vendor updateVend(@RequestBody Vendor vendor, @PathVariable("id") String id) {
        return myVendorSrv.updateVendorById(id, vendor);
    }

    @GetMapping("companyName/{name}")
    public List<Vendor> getCompanyNames(@PathVariable("name") String id) {
        return myVendorSrv.getCustomerByCompanyName(id);
    }

    @GetMapping("emailId/{name}")
    public List<Vendor> getByEmail(@PathVariable("name") String id) {
        return myVendorSrv.searchCustomerByEmailId(id);
    }

}
