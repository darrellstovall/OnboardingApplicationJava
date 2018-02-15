package com.darrellstovall.onboardingapplicationjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

private static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Hello there. How are you?"); 
		
		//Similar in C# to Console.WriteLine("")
		
		User user = new User();
		
		user.setLastName(askQuestion("What is your last name?"));
		System.out.println("Your last name is " + user.getLastName() + ".");

		user.setFirstName(askQuestion("What is your first name?"));
		System.out.println("Your first name is " + user.getFirstName() + ".");
		
		user.setMinor(askBoolQuestion("Are you a minor?"));
		
		if (user.isMinor()) {
			user.setAge(askIntQuestion("How old are you?"));
			if (user.getAge() <= 18) {
				System.out.println("You're a minor who is " + user.getAge() + " years old.");
			} else {
				System.out.println("You're not a minor.");
			}
		} else {
			System.out.println("You're older than 18.");
		}
				
		System.out.println("Your full name is " + user.getFullName() + ".");
	}
	
	public static String askQuestion(String question) {
		System.out.println(question);
		return reader.nextLine();
	}

	public static boolean askBoolQuestion(String question) {
		Boolean result = null;
		
		while (result == null) {
			System.out.println(question + ": Type true or false.");
			
			try {
				result = reader.nextBoolean();
			} catch (InputMismatchException e) {
				System.out.println("You have to type in true or false.");
				reader.nextLine();
			}
		}
		return result;
	}
	
	public static int askIntQuestion(String question) {
		
		int result = 0;
		
		while (result < 1 || result > 99)	{
			System.out.println(question);
			
			try {
				result = reader.nextInt();
				
				if (result <1 || result > 105) {
					System.out.println("Type your actual age.");
				}
			} catch (InputMismatchException e) {
				System.out.println("You have to type in a number.");
				reader.nextLine();
			}
		}
		
		return result;		
	}
}
