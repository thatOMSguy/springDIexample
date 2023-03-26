package com.springbootprojects.springdi.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


//@ActiveProfiles("EN")
@SpringBootTest
public class Myi18nControllerTestEN {

    @Autowired
    Myi18nController myi18nController;

    @Test
    void sayHelloTest() {

        /**at this point both my EN and ES controller class are qualified with same name "i18nService"
         * which results in java.lang.IllegalStateException, exact error below
         *
         * Annotation-specified bean name 'i18nService' for bean class
         * [com.springbootprojects.springdi.services.i18n.SpanishGreetingService] conflicts with existing,
         * non-compatible bean definition of same name and class
         * [com.springbootprojects.springdi.services.i18n.EnglishGreetingService]
         */
        System.out.println(myi18nController.sayHello());
    }
}
