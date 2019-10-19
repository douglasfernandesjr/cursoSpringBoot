package com.example.demo.config;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SwaggerConfigTest {

  @Test
  public void shouldGetDocket() {
    SwaggerConfig swaggerConfig = new SwaggerConfig();
    assertNotNull("Docket cannot be null!", swaggerConfig.api());
  }

  @Test
  public void shouldGetApiInfo() {
    SwaggerConfig swaggerConfig = new SwaggerConfig();
    assertNotNull("ApiInfo cannot be null!", swaggerConfig.apiInfo());
  }

}
