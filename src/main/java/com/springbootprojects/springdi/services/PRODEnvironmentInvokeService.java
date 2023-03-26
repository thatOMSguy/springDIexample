package com.springbootprojects.springdi.services;


import org.springframework.context.annotation.Profile;

@Profile("prod")
public class PRODEnvironmentInvokeService implements EnvironmentInvokeService {

    @Override
    public String invokeEnvironment() {
        return "Invoked From PROD Service";
    }
}
