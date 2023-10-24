package com.example.dbboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.dbboot.entity.Address;
import com.example.dbboot.service.AddressService;

public class AddressController {
    @Autowired
    private AddressService service;

    @GetMapping("/addresses")
    public List<Address> getAllAddress() {
        return service.readAll();
    }

    @GetMapping("/singleAddress/{value}")
    public Optional<Address> getSingleAddress(@PathVariable("value") String value) {
        return service.singleAddress(value);
    }

    @PostMapping("/createAddress")
    public Address newAddress(@RequestBody Address address) {
        return service.createAddress(address);
    }
} 
