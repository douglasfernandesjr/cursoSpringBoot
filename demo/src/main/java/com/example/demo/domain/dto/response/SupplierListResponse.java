package com.example.demo.domain.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SupplierListResponse{
    
  private Integer id;
  
  private String companyName;
  
  private String city;

  private String country;

}