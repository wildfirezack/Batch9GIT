package com.class05;

import java.util.Scanner;

public class ClassTask03 {

	public static void main(String[] args) {
		
		Scanner input;
		int quiz, midTerm, finalScore;
		char grade;
		
		input=new Scanner(System.in);
		System.out.println("Enter your quiz score");
		
		quiz=input.nextInt();
		
		System.out.println("Enter your Mid Term score");
		
		midTerm=input.nextInt();
		
		System.out.println("Enter your Final score");
		
		finalScore=input.nextInt();
		
		
		int average=((quiz+midTerm+finalScore)/3);
		
		if (average >= 90) {
			grade = 'A';
		}else if (average >= 70 && average <90) {
			grade = 'B';
		}else if (average >= 50 && average <70) {
			grade = 'C';			
		}
		else if (average < 50) {
			grade = 'F';
		}else
			System.out.println("System Error");
		
		System.out.println("Your grade is " + grade);
		if (grade == 'A' || grade =='B') {
			System.out.println("I am Happy !!!");
		}
	}
	

}
