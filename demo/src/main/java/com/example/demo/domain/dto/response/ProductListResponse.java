package com.example.demo.domain.dto.response;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductListResponse{
    
    private Integer id;

    private String productName;

    private String packageName;

    private Boolean isDiscontinued;

    private BigDecimal unitPrice;
}