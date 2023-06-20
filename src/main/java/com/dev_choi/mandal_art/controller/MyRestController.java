package com.dev_choi.mandal_art.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
    @PostMapping("/myForm")
    public ResponseEntity myForm(@RequestParam String value1, @RequestParam String value2) {
        System.out.println(value1 + " " + value2);
        return ResponseEntity.status(HttpStatus.OK).body("succcess");
    }

}
