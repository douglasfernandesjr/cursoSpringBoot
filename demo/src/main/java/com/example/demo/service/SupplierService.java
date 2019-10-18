package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.entities.Supplier;
import com.example.demo.exception.DataNotFoundException;
import com.example.demo.repository.SupplierRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository repository;

    public Supplier findById(Long id) {
        Optional<Supplier> supplier = repository.findById(id);
        return supplier.orElseThrow(() -> new DataNotFoundException("Supplier Not found"));
    }

    public List<Supplier> ListAll() {
        return repository.findAll();
    }

}