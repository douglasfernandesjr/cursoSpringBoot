package com.example.demo.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Supplier")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Supplier{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Id", nullable = false)
  private Long id;
  
  @Column(name = "CompanyName", nullable = false, length = 40)
  private String companyName;
  
  @Column(name = "ContactName", length = 50)
  private String contactName;
  
  @Column(name = "ContactTitle", length = 40)
  private String contactTitle;

  @Column(name = "City", length = 40)
  private String city;

  @Column(name = "Country", length = 40)
  private String country;

  @Column(name = "Phone", length = 30)
  private String phone;

  @Column(name = "Fax", length = 30)
  private String fax;
}