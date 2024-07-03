package com.lxisoft.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @GetMapping("/user")
    public String user(){
        System.out.println("Inside usre");
        return "user" ;
    }
}
