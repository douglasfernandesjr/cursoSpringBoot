package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/values")
public class ValueController {

    @GetMapping()
    public ResponseEntity<List<String>> listAll() {
        List<String> list = new ArrayList<String>();

        list.add("Some");
        list.add("values");
        list.add("list");
        return ResponseEntity.ok(list);
    }
}