package com.springbootprojects.springdi.services;


import org.springframework.context.annotation.Profile;


@Profile("uat")
public class UATEnvironmentInvokeService implements EnvironmentInvokeService {


    @Override
    public String invokeEnvironment() {
        return "Invoked from UAT Service";
    }
}
