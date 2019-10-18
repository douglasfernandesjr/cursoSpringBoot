package com.example.demo.domain.dto.request;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value = "ProductUpdateRequest", description = "Used to update a Product")
public class ProductUpdateRequest {

    @NotNull(message = "Product Id cannot be null")
    @ApiModelProperty(notes = "Id", name = "productName", required = true)
    private Integer id;

    @ApiModelProperty(notes = "Product Name", name = "productName")
    private String productName;

    @ApiModelProperty(notes = "Package Name", name = "packageName")
    private String packageName;

    @ApiModelProperty(notes = "unit Price", name = "unitPrice", value = "decimal")
    private BigDecimal unitPrice;

    @ApiModelProperty(notes = "is Discontinued", name = "isDiscontinued", value = "decimal")
    private Boolean isDiscontinued;

}