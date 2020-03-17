package ouzture.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ouzture.springframework.sfgdi.controllers.*;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);


		I18nController i18nController = (I18nController) context.getBean("i18nController");
		System.out.println(i18nController.sayHello());


		MyController myController = (MyController) context.getBean("myController");

		System.out.println("Primary controller ---");
		System.out.println(myController.sayHello());

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
