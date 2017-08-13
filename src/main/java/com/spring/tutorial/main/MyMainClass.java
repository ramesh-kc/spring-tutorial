package com.spring.tutorial.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMainClass {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
		MyService myService = applicationContext.getBean(MyService.class);

		myService.log("It's me Ramesh KC");

		MyService myService1 = applicationContext.getBean(MyService.class);
		System.out.println("Service 1 hashCode: " + myService.hashCode());
		System.out.println("Service 2 hashCode: " + myService1.hashCode());


	}
}
