package com.example.dbboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dbboot.entity.Address;

@Component
public class AddressService {
    @Autowired
    private Iaddress iaddress;

    public List<Address> readAll() {
        return iaddress.findAll();
    }

    public Optional<Address> singleAddress(String addressId) {
        return iaddress.findById(addressId);
    }

    public Address createAddress(Address address) {
        if (address.getCountry()=="USA") {
            throw new Error("usa not authorised ");
        }
        return iaddress.save(address);
    }
}
