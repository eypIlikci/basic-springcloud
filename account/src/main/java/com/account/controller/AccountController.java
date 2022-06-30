package com.account.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class AccountController {
    @GetMapping("/account")
    ResponseEntity<?> getAllAccount(){
        return ResponseEntity.ok(Arrays.asList("asd","aasds"));
    }
}
