package com.springbootprojects.springdi.services;

import org.springframework.stereotype.Service;


@Service("setterGreetingBean")
public class GreetingServiceSetterInjected implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Greeting from Setter Injected Service class";
    }
}
