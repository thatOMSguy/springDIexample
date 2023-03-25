package com.springbootprojects.springdi.services;


import org.springframework.stereotype.Service;


/**
 * We are annotating it as a Service which tells Spring that it is a Spring managed component,
 * and also in our 3 controllers we annotated them with @COntroller which tells its also a spring managed component
 * more details added on eacg controller classes as to how it works
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello from Base Greeting service class";
    }
}
