package com.example.springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class RandomController {
    @GetMapping("/random")
    public ResponseEntity<String> getRandomResult() {
        boolean randomBoolean = new Random().nextBoolean();

        if (randomBoolean) {
            String message = "Successo!";
            return ResponseEntity.ok().body(message);
        } else {
            String message = "Bad request!";
            return ResponseEntity.badRequest().body(message);
        }
    }
}
