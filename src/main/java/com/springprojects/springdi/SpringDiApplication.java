package com.springprojects.springdi;

import com.springprojects.springdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springprojects.springdi.controllers", "com.springprojects.springdi.services"})
public class SpringDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringDiApplication.class, args);

		//Context ad
		// ds Spring annotated classes as Beans (dependency injection). Standard bean name is the class name starting with lower case.
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("Primary Greeting---");

		String greeting = myController.getGreeting();

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


		System.out.println("International Greeting---");

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");

		System.out.println(i18nController.sayHello());
	}

}
