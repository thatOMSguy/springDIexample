package com.springbootprojects.springdi.controllers;

import com.springbootprojects.springdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;


    public String sayHello() {
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
