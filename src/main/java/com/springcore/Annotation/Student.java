package com.springcore.Annotation;

import org.springframework.stereotype.Component;

@Component("firstStudent")

public class Student {

	private Samosa samosa;

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public void study() {

		this.samosa.display();
		System.out.println("I am inside Student class");
	}
}
