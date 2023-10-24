package com.example.dbboot.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dbboot.entity.Address;

public interface Iaddress extends JpaRepository<Address, String> {

}
