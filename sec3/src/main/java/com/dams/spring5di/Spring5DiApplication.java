package com.dams.spring5di;

import com.dams.spring5di.controllers.ConstructorInjectedController;
import com.dams.spring5di.controllers.I18nController;
import com.dams.spring5di.controllers.MyController;
import com.dams.spring5di.controllers.PropertyInjectedController;
import com.dams.spring5di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5DiApplication.class, args);

		I18nController i18nController =
				(I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());

		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("----- Primary");

		System.out.println(myController.sayHello());

		System.out.println("----- Property");

		PropertyInjectedController propertyInjectedController =
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----- Setter");

		SetterInjectedController setterInjectedController =
				(SetterInjectedController) ctx.getBean("setterInjectedController");

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----- Constructor");

		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) ctx.getBean("constructorInjectedController");

		System.out.println(constructorInjectedController.getGreeting());
	}

}
