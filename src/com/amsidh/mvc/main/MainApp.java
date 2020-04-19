package com.amsidh.mvc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amsidh.mvc.domain.Person;

public class MainApp {

	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-beans.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getPersonName());
		person.setPersonName("Aditya");
		System.out.println(person.getPersonName());

		try {
			person.display(23, 0);
		} catch (Exception e) {
			
		}

	}

}
