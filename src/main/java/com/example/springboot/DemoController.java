package com.example.springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DemoController {
    @GetMapping("/hello")
    public String getHello() {
        return "Hello, world!";
    }
    @GetMapping("/greeting")
    public ResponseEntity<String> greeting() {
        if(new Date().getHours() < 10){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok("Good Morning Pit!");
    }
}
