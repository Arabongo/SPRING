package com.example.springboot;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    @GetMapping(value = "/info")
    public ResponseEntity<String> getInfo() {
        String message = "This is the information endpoint";
        return ResponseEntity.ok().body(message);
    }
}
