package com.spring.tutorial.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.tutorial.main")
public class MyConfiguration {

	@Bean
	public MyService getService() {
		return new MyService();
	}
}
