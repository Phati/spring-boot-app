package com.joshsoftware.springbootapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {
    @GetMapping("/")
    public ResponseEntity<?> getJavaVersion() {
        return new ResponseEntity<>("Hello! from Spring boot application", HttpStatus.OK);
    }
}
