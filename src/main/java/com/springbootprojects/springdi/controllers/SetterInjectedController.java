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
public class SetterInjectedController {

    /**
     * Placing this annotation on the property will force the property be utilized
     * if we put it on setter method then it ll be utilized elese not.*/


    private GreetingService greetingService;

    /**
     * having the qualifier and autowired on property above
     * is not the way to invoke this setter below,
     * it won't inject the setter but rather the property itself
     * so the recommenced way for a setter injection is to put these annotations on the setter method
     * A simple way to verify this is just put these two on property above then the setter method below says "Found No Usages"
     * that means injection is not happening but when we put it back it becomes yellow from grey meaning its in use
     */

    @Qualifier("setterGreetingBean")
    @Autowired
    public void setGreetingService(
            GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }



}
