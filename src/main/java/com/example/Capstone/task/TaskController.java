package com.example.Capstone.task;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/test")
    public ResponseEntity<String> execute() {
        return ResponseEntity.ok().body("Success!");
    }

}
