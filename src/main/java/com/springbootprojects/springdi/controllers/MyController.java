package com.springbootprojects.springdi.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("In the Controller");
        return "Hello!!!!";
    }
}
