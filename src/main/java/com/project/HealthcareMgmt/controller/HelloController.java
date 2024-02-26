package com.project.HealthcareMgmt.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth/v1")
public class HelloController {

    @GetMapping("/say")
    public ResponseEntity<String> say(){
        return new ResponseEntity<>("Hi Welcome!", HttpStatus.OK);
    }

}
