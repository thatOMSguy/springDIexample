package com.springbootprojects.springdi.controllers;

import org.junit.jupiter.api.Test;

class MyControllerTest {

    @Test
    void sayHello() {
        MyController myController = new MyController();

        System.out.println(myController.sayHello());
    }
}