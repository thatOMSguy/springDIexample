package com.springbootprojects.springdi.controllers;

import com.springbootprojects.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * We marked this controller class with @Controller which indicates to Spring that it is spring managed component,
 * Here we need to put @Autowired on the property, this turn over all dependency injection to Spring
 * allowing spring to create and manage components as needed in application
 * However this is not recommended APPROACH !! at all
 */
@Controller
public class PropertyInjectedController {


    //what happened here is as soon i added a custom name to my service class GreetingServicePropertyInjected it
    // resulted in the below line giving error so to overcome just give qualifier the custom name give in thet service class
    //@Qualifier("greetingServicePropertyInjected")

    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
