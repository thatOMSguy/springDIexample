package com.springbootprojects.springdi.controllers;


import com.springbootprojects.springdi.services.GreetingService;
import com.springbootprojects.springdi.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    /**
     * Here we are creating dependency on GreetingService but internal to the controller
     * the controller has all the control as how that greeting service is created and how it is
     * managed, i.e not exactly how we want to do in Spring framework
     */
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }


    public String sayHello() {
        System.out.println("In the Controller");
        return greetingService.sayGreeting();
    }
}
