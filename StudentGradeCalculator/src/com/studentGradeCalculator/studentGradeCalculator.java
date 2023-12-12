package com.studentGradeCalculator;

import java.util.Scanner;

public class studentGradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Subject Marks (out of 100):");
		int numSubjects = 5;
		int[] marks = new int[numSubjects];

		for (int i = 0; i < numSubjects; i++) {
			System.out.print("Sub " + (i +1) + "= ");
			marks[i] = sc.nextInt();
		}

		int totalMarks = calculateTotalMarks(marks);

		double Percentage = calculateAveragePercentage(totalMarks, numSubjects);

		String grade = calculateGrade(Percentage);

		displayResults(totalMarks, Percentage, grade);

	}

	private static int calculateTotalMarks(int[] marks) {
		int totalMarks = 0;
		for (int mark : marks) {
			totalMarks += mark;
		}
		return totalMarks;
	}

	private static double calculateAveragePercentage(int totalMarks, int numSubjects) {
		return (double) totalMarks / numSubjects;
	}

	private static String calculateGrade(double Percentage) {
		if (Percentage >= 90)return "A+"; 
		else if (Percentage >= 80) return "A";
		else if (Percentage >= 70) return "B+"; 
		else if (Percentage >= 60) return "B";  
		else if (Percentage >= 50) return "C";
		else return "F";
			
		
	}

	private static void displayResults(int totalMarks, double Percentage, String grade) {
		System.out.println("Result:");
		System.out.println("Your Marks: " + totalMarks + " Out Of "+ 500);
		System.out.println("Percentage: " + Percentage + "%");
		System.out.println("Grade: " + grade);
	}

}
