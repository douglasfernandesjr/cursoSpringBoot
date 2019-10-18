package com.example.demo.domain.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SupplierListResponse{
    
  private Long id;
  
  private String companyName;
  
  private String city;

  private String country;

}