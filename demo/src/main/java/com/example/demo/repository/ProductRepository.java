package com.example.demo.repository;

import java.util.List;

import com.example.demo.domain.entities.Product;
import com.example.demo.domain.entities.Supplier;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

    List<Product> findBySupplier(Supplier supplier);
}