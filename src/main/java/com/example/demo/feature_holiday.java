package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class feature_holiday {
    @GetMapping("/feature_holiday")
    public String getData() {return  "Please book your flight at 10% discount from feature_holiday" ; }
}
