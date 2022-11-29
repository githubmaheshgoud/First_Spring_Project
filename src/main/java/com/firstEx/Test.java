package com.firstEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		Amazon r = con.getBean("emp",Amazon.class);
		System.out.println(r.toString());
		System.out.println("app details : "+r.getApp());
		System.out.println("id details : "+r.getId());
		System.out.println("items details : "+r.getItems());
		System.out.println("jeans details : "+r.getJeans());
		System.out.println("shirt details : "+r.getShirt());
		
	}
}
