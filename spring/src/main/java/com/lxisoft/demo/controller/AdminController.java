package com.lxisoft.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class AdminController {

    @GetMapping("/admin")
    public String admin() {
        System.out.println("Inside admin");
        return "admin";
    }
    



}
