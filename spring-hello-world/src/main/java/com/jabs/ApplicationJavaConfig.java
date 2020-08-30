package com.jabs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jabs.bean.HelloWorld;
import com.jabs.config.AppConfig;

public class ApplicationJavaConfig {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		HelloWorld helloWorld = (HelloWorld) context.getBean("helloBean");
		helloWorld.printHello("Java Config: Hello world");
	}
}