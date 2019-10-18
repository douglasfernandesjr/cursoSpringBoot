package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  public static final String TITLE = "Demo API";
  public static final String DESCRIPTION = "Demo API, a simple example.";
  public static final String PACKAGE = "com.example.demo";

  @Value("${info.app.version}")
  private String appVersion;

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2) //
        .select() //
        .apis(RequestHandlerSelectors.basePackage(PACKAGE)) //
        .paths(PathSelectors.any()) //
        .build() //
        .apiInfo(apiInfo());
  }

  ApiInfo apiInfo() {
    return new ApiInfoBuilder() //
        .title(TITLE) //
        .description(DESCRIPTION) //
        .version(appVersion) //
        .build();
  }
}