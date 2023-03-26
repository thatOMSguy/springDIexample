package com.springbootprojects.springdi.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class Myi18nControllerTest {

    @Autowired
    Myi18nController myi18nController;

    @Test
    void sayHello() {
        System.out.println(myi18nController.sayHello());


    }
}