package com.springbootprojects.springdi.services;


import org.springframework.context.annotation.Profile;

@Profile("qa")
public class QAEnvironmentInvokeService implements EnvironmentInvokeService {


    @Override
    public String invokeEnvironment() {
        return "Invoked from QA Services";
    }
}
