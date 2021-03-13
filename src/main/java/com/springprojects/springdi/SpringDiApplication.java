package com.springprojects.springdi;

import com.springprojects.springdi.controllers.ConstructorInjectedController;
import com.springprojects.springdi.controllers.MyController;
import com.springprojects.springdi.controllers.PropertyInjectedController;
import com.springprojects.springdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springprojects.springdi.controllers", "com.springprojects.springdi.services"})
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		//Context adds Spring annotated classes as Beans (dependency injection). Standard bean name is the class name starting with lower case.
		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("Property Injected---");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("Constructor Injected---");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());


		System.out.println("Setter Injected---");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());
	}

}
