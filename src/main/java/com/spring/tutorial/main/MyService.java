package com.spring.tutorial.main;

import java.util.Date;

public class MyService {

	public void log(String msg) {
		System.out.println(new Date() + " :: " + msg);
	}
}
