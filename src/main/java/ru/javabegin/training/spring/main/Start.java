package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.impls.robot.ModelT1000;

public class Start {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		ModelT1000 t1000 =(ModelT1000) context.getBean("T1000");
		System.out.println(t1000);
		context.close();
		/*t1000.fire();
		t1000 = (ModelT1000) context.getBean("T1000");
		System.out.println(t1000);
*/
	}
}
