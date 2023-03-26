package com.springbootprojects.springdi.controllers.i18n;

import com.springbootprojects.springdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


/**
 * Spring Profiles -> Profiles are way to control what beans are wired into the context and which one are not.
 * Here we created one controller with name i18n which reperesents abbreviation for internationalization
 */
@Controller
public class Myi18nController {


    private final GreetingService greetingService;

    public Myi18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}





