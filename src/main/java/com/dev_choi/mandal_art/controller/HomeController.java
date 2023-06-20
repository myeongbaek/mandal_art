package com.dev_choi.mandal_art.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "index";
    }

//    @ResponseBody
//    @RequestMapping(value = "/myForm", method = RequestMethod.POST)
//    public void getMyForm(@RequestParam String value1, @RequestParam String value2){
//        System.out.println(value1 + " " + value2);
//    }
}
