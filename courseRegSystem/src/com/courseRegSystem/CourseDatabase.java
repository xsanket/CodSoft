package com.courseRegSystem;

import java.util.ArrayList;
import java.util.List;

public class CourseDatabase {
	List<Course> courses;

    public CourseDatabase() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayCourses() {
        for (Course course : courses) {
            System.out.println("Code: " + course.code + ", Title: " + course.title + ", Capacity: " + course.capacity);
        }
    }

}
