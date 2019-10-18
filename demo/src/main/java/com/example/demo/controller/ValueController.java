package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/values")
@Api(tags = { " Values " }, value = "Api for return values")
@Slf4j
public class ValueController {

    @ApiResponses(value = { @ApiResponse(code = 200, message = "Return a list with values"),
            @ApiResponse(code = 404, message = "Values not found"), })
    @GetMapping()
    public ResponseEntity<List<String>> listAll() {
        List<String> list = new ArrayList<String>();

        list.add("Some");
        list.add("values");
        list.add("list");
        return ResponseEntity.ok(list);
    }
}