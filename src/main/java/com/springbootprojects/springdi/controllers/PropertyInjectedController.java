package com.springbootprojects.springdi.controllers;

import com.springbootprojects.springdi.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
