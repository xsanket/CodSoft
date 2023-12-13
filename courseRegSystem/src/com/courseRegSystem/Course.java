package com.courseRegSystem;

public class Course {
	String code;
    String title;
    int capacity;
    String description;
    
    String schedule;
	public Course(String code, String title, String description, int capacity, String schedule) {
		super();
		this.code = code;
		this.title = title;
		this.description = description;
		this.capacity = capacity;
		this.schedule = schedule;
	}
    
    

}
