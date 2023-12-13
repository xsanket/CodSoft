package com.courseRegSystem;

import java.util.Scanner;

public class CourseRegistrationSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		CourseDatabase courseDatabase = new CourseDatabase();
		StudentDatabase studentDatabase = new StudentDatabase();

		courseDatabase.addCourse(new Course("101", "core Java", "java", 100, "weekdays"));
		courseDatabase.addCourse(new Course("202", "Advance Java", "Spring Boot", 90, "weekends"));
		courseDatabase.addCourse(new Course("203", "Web tech", "React Js", 100, "everyday"));
		courseDatabase.addCourse(new Course("204", "Data Base", "Mongo DB", 100, "everyday"));

		studentDatabase.addStudent(new Student(1, "Sanket"));
		studentDatabase.addStudent(new Student(2, "iron man"));
		studentDatabase.addStudent(new Student(3, "spider man"));
		studentDatabase.addStudent(new Student(4, "ant man"));
		studentDatabase.addStudent(new Student(5, "super man"));
		studentDatabase.addStudent(new Student(6, "krish man"));
		studentDatabase.addStudent(new Student(7, "sand man"));

		System.out.println("Available Courses:");
		courseDatabase.displayCourses();

		int studentId = getStudentId(scanner);

		for (Student student : studentDatabase.students) {
			if (student.id == studentId) {
				student.registeredCourses.add(getCourseCode(scanner));
				break;
			}
		}

		studentDatabase.displayStudentCourses(studentId);
	}

	private static int getStudentId(Scanner scanner) {
		while (true) {
			try {
				System.out.print("Enter your student ID: ");
				return Integer.parseInt(scanner.nextLine());
			} catch (NumberFormatException e) {
				System.out.println("Invalid input");
			}
		}
	}

	private static String getCourseCode(Scanner scanner) {
		System.out.print("Enter course code : ");
		return scanner.nextLine();
	}

}
