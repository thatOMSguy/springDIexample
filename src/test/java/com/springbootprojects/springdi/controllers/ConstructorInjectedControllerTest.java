package com.springbootprojects.springdi.controllers;

import com.springbootprojects.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;


    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    void sayHello() {

        System.out.println(controller.sayHello());
    }
}