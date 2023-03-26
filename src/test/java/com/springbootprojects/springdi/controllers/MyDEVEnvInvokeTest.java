package com.springbootprojects.springdi.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class MyDEVEnvInvokeTest {

    @Autowired
    MyEnvInvokeController myEnvInvokeController;

    @Test
    void checkIfInvokeSuccess() {
        System.out.println(myEnvInvokeController.invokeEnv());
    }
}
