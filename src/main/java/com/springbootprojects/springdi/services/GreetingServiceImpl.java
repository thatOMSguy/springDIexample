package com.springbootprojects.springdi.services;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Greeting service";
    }
}
