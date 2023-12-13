package com.courseRegSystem;

import java.util.ArrayList;
import java.util.List;

public class StudentDatabase {
	 List<Student> students;

	    public StudentDatabase() {
	        this.students = new ArrayList<>();
	    }

	    public void addStudent(Student student) {
	        students.add(student);
	    }

	    public void displayStudentCourses(int studentId) {
	        for (Student student : students) {
	            if (student.id == studentId) {
	                System.out.println("Student: " + student.name + ", Courses: " + student.registeredCourses);
	                return;
	            }
	        }
	        System.out.println("Student not found with ID: " + studentId);
	    }

}
