package com.mycicd;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @GetMapping("/")
    public String home() {
        return "Welcome to home";
    }
    
    @GetMapping("/hello/{id}")
    public String home(@PathVariable("id") String id){
        return "Hello "+id;
    }
}
