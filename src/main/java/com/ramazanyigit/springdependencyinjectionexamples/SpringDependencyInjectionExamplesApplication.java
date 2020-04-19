package com.ramazanyigit.springdependencyinjectionexamples;

import com.ramazanyigit.springdependencyinjectionexamples.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionExamplesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionExamplesApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
