package com.courseRegSystem;

import java.util.ArrayList;
import java.util.List;

public class Student {
	int id;
    String name;
    List<String> registeredCourses;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.registeredCourses = new ArrayList<>();
    }

}
