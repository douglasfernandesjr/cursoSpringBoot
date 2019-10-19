package com.example.demo.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.List;

import com.example.demo.domain.entities.Product;
import com.example.demo.domain.entities.Supplier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ProductRepositoryTest  {


    @Mock
    private ProductRepository repository;

    private final Integer SupplierId = 2;

    @Test
    public void givenFindByAnalysisId() {
        List<Product> value = repository.findBySupplier(Supplier.builder().id(SupplierId).build());
        verify(repository, times(1)).findBySupplier(Supplier.builder().id(SupplierId).build());
        assertThat(value.size()).isEqualTo(0);
    }
}