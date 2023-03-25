package com.springbootprojects.springdi.controllers;

import com.springbootprojects.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


/**
 * We marked this controller class with @Controller which indicates to Spring that it is spring managed component,
 * In this case of constructor controller, in the lifecycle of the bean,
 * Spring needs to create an instance of controller, to put that into context, sees that its a constructor,
 * So in turn it will execute and inject a Greeting Service into constructor which tells spring that it first
 * need to create the Greeting service and then inject it into this.
 */

@Controller
public class ConstructorInjectedController {

    private final GreetingService greetingService;

    /**
     * what we did here is we added teh @Qualifier annotation to ensure my Junit for this class doesnt call the Primary Bean
     * but call this GreetingServiceImpl class bean,
     * the default way spring creates its bean is in camelcase starting with lowercase letter
     */
    public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
