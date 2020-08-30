package com.jabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jabs.bean.HelloWorld;

public class ApplicationXMLConfig {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean-config.xml");

		HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
		helloWorld.printHello();
	}
}