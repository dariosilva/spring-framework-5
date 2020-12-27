package com.dams.spring5di;

import com.dams.spring5di.controllers.ConstructorInjectedController;
import com.dams.spring5di.controllers.MyController;
import com.dams.spring5di.controllers.PropertyInjectedController;
import com.dams.spring5di.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.dams.spring5di.services", "com.dams.spring5di"})
public class Spring5DiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5DiApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
