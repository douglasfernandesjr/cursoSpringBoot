package com.example.demo.domain.mapper;

import com.example.demo.domain.dto.response.SupplierListResponse;
import com.example.demo.domain.entities.Supplier;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SupplierMapper {

    @Autowired
    ModelMapper mapper;

    public SupplierListResponse toDto(Supplier input) {

        return  mapper.map(input, SupplierListResponse.class);
    }
}
