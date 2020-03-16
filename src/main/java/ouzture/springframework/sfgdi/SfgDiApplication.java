package ouzture.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ouzture.springframework.sfgdi.controllers.ConstructorInjectedController;
import ouzture.springframework.sfgdi.controllers.MyController;
import ouzture.springframework.sfgdi.controllers.PropertyInjectedController;
import ouzture.springframework.sfgdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("Property injection ---");

		PropertyInjectedController propertyInjectedController = context.getBean(PropertyInjectedController.class);

		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("Setter injection ---");

		SetterInjectedController setterInjectedController = context.getBean(SetterInjectedController.class);

		System.out.println(setterInjectedController.getGreeting());

		System.out.println("Constructor injection ---");

		ConstructorInjectedController constructorInjectedController = context.getBean(ConstructorInjectedController.class);

		System.out.println(constructorInjectedController.getGreeting());




	}

}
