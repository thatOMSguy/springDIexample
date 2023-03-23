package com.springbootprojects.springdi;

import com.springbootprojects.springdi.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringdiApplicationTests {

	@Autowired //tels spring to insert a context for us
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutoWireOfController() {
		System.out.println(myController.sayHello());
	}

	@Test
	void getControllerFromContext() {
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println(controller.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
