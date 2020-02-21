package com.annotation.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Human hm = context.getBean("human", Human.class);
		hm.displayHeatStatus();
		
		
	}

}
