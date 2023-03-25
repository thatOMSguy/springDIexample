package com.springbootprojects.springdi.services;


import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Not a wise idea to do Property Injection";
    }
}
