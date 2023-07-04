package com.dev_choi.mandal_art.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MandalController {
    @PostMapping(value = "/mandal")
    public Map mandalSave(@RequestBody Map<String, Object> requestData) {
        Map<String, Object> result = new HashMap();

        requestData.forEach((key, value) -> {
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });

        result.put("msg", "Success");
        return result;
    }

    @PostMapping(value = "/mandal/sub")
    public void mandalSubSave(@RequestBody Map<String, Object> requestData) {
        requestData.forEach((key, value) -> {
            System.out.println("key : " + key);
            System.out.println("value : " + value);
        });
    }
}
