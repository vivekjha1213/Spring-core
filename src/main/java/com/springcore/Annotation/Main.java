package com.springcore.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
		
		Student student=(Student)context.getBean("firstStudent");
		System.out.println(student);
		student.study();
		student.getSamosa();
	}

}
