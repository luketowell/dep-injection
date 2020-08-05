package com.luketowell.depinjection;

import com.luketowell.depinjection.controllers.ConstructorInjectedController;
import com.luketowell.depinjection.controllers.MyController;
import com.luketowell.depinjection.controllers.PrimaryInjectedController;
import com.luketowell.depinjection.controllers.PropertyInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DepinjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DepinjectionApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.helloWorld();

		System.out.println(greeting);

		System.out.println(" __________ Property _________");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("_________ Constructor __________");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());

		System.out.println("________ Primary ________");

		PrimaryInjectedController primaryInjectedController = (PrimaryInjectedController) ctx.getBean("primaryInjectedController");
		System.out.println(primaryInjectedController.getGreeting());
	}

}
