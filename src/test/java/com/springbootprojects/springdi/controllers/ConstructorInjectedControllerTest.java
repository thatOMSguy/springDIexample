package com.springbootprojects.springdi.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConstructorInjectedControllerTest {


    @Autowired
    ConstructorInjectedController controller;

 //We don't need to exclusively set this up since Spring now manages the dependency of object
//    @BeforeEach
//    void setUp() {
//        controller = new ConstructorInjectedController(new GreetingServiceImpl());
//
//    }

    @Test
    void sayHello() {
        System.out.println(controller.sayHello());
    }
}