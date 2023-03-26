package com.springbootprojects.springdi.controllers;


import com.springbootprojects.springdi.services.EnvironmentInvokeService;
import org.springframework.stereotype.Controller;


@Controller
public class MyEnvInvokeController {

    private final EnvironmentInvokeService environmentInvokeService;

    public MyEnvInvokeController(
            EnvironmentInvokeService environmentInvokeService) {
        this.environmentInvokeService = environmentInvokeService;
    }

    public String invokeEnv() {
        return environmentInvokeService.invokeEnvironment();
    }


}
