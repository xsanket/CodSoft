package com.numberGame;

import java.util.Random;
import java.util.Scanner;

public class numberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();

		int upperLimit = 100;
		int lowerLimit = 1;
		int noOfAttempts = 10;
		int score = 0;

		do {
			int magicNumber = rn.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
			int attempts = 0;
			boolean gotIt = false;

			System.out.println("guess a number between 1 to 100");

			while (noOfAttempts > attempts) {
//				System.out.println("guess a number between 1 to 100");
				int guess = sc.nextInt();
				attempts++;

				if (guess == magicNumber) {
					System.out.println("Congratulations you have guessed it correctly in " + attempts + " attempts");
					gotIt = true;
					score = noOfAttempts - attempts + 1;
					break;

				} 
				else if (guess < magicNumber && attempts<= noOfAttempts) {
					System.out.println("think of higher side");
				} 
				else {
					System.out.println("try little lower");
				}
			}
			
			if(!gotIt) {
				System.out.println("ran out of attempts!!!! It was "+magicNumber + ", better luck next time." );
			}
			
			 System.out.print("Want to try again? (y/n): ");
	            String tryAgain = sc.next().toLowerCase();
	            if (!tryAgain.equals("y")) {
	                break;
	            }
			

		} while (true);
		
		 System.out.println("your score is: " + score);
	}

}
