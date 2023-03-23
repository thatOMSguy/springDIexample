package com.springbootprojects.springdi.controllers;

import com.springbootprojects.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * We marked this controller class with @Controller which indicates to Spring that it is spring managed component,
 * Here we need to put @Autowired on the property, this turn over all dependency injection to Spring
 * allowing spring to create and manage components as needed in application
 * However this is not recommended APPROACH !! at all
 */
@Controller
public class PropertyInjectedController {

    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
