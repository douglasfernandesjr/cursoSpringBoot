package com.example.demo.domain.mapper;

import com.example.demo.domain.dto.request.ProductCreateRequest;
import com.example.demo.domain.dto.response.ProductListResponse;
import com.example.demo.domain.entities.Product;
import com.example.demo.domain.entities.Supplier;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {

    @Autowired
    ModelMapper mapper;

    public ProductListResponse toDto(Product input) {
        return  mapper.map(input, ProductListResponse.class);
    }

    public Product ToEntity(ProductCreateRequest input) {
        Product model = mapper.map(input, Product.class);
        model.setIsDiscontinued(false);
        model.setSupplier(Supplier.builder().id(input.getSupplierId()).build());
        return  model;
    }
}
