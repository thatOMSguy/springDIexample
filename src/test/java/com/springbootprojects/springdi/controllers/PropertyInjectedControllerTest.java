package com.springbootprojects.springdi.controllers;

import com.springbootprojects.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;


    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();

        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }


    @Test
    void sayHello() {

        System.out.println(propertyInjectedController.sayHello());

    }
}