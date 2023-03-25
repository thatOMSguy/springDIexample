package com.springbootprojects.springdi.services;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


/**
 * if we have another service class implementing our main service interface
 * the Junit will run into an error saying there are multiple matching bean instead of a single one
 * so to overcome it we add @Primary annotation
 */
@Primary
@Service
public class GreetingServicePrimary implements GreetingService {


    @Override
    public String sayGreeting() {
        return "Say Hello from Primary Bean";
    }
}
