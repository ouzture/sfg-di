package ouzture.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ouzture.springframework.sfgdi.controllers.MyController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController = (MyController) context.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

	}

}
