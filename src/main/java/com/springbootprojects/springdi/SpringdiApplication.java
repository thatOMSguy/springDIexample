package com.springbootprojects.springdi;

import com.springbootprojects.springdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdiApplication {

	public static void main(String[] args) {

//Refer https://www.baeldung.com/spring-application-context to understand ApplicationContext
		ApplicationContext context = SpringApplication.run(SpringdiApplication.class, args);
		MyController myController = context.getBean(MyController.class);
		System.out.println("In Main Class");
		System.out.println(myController.sayHello());


	}

}
