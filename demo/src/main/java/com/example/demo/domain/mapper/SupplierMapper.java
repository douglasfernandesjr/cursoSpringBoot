package com.example.demo.domain.mapper;

import com.example.demo.domain.dto.response.SupplierListResponse;
import com.example.demo.domain.entities.Supplier;

import org.springframework.stereotype.Component;

@Component
public class SupplierMapper {

    public SupplierListResponse toDto(Supplier input) {
        SupplierListResponse item = new SupplierListResponse();
        item.setCity(input.getCity());
        item.setCompanyName(input.getCompanyName());
        item.setCountry(input.getCountry());
        item.setId(input.getId());
        return item;
    }
}
