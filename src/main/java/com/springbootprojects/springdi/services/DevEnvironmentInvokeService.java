package com.springbootprojects.springdi.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;


@Profile({"dev", "default"})
@Service
public class DevEnvironmentInvokeService implements EnvironmentInvokeService {


    @Override
    public String invokeEnvironment() {
        return "Invoked from DEV Service";
    }


}
