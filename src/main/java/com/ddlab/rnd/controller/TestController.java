package com.ddlab.rnd.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {

    @Value("${user.role:hello}")
    private String role;
    
    @Value("${db.name}")
    private String message;

    @GetMapping("/what/message")
    public ResponseEntity<String> whatIsMessage() {
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
