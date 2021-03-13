package com.class05;

import java.util.Scanner;

public class LogicalOperatorsExample {

	public static void main(String[] args) {
		/*ask user to enter age
		 * based on the age
		 * 
		 */
		Scanner input;
		String name;
		int age;
		

		input=new Scanner(System.in);
		System.out.println("Please enter your name");
		
		name=input.next();
		
		System.out.println("Please enter your age");

		age=input.nextInt();

		if (age>=1 && age<3) {
			System.out.println(name+" you are a baby");
		}else if (age>=3 && age<5) {
			System.out.println(name+" you are a bigger baby");
		}else if (age>=5 && age<=12) {
			System.out.println(name+" you are a kid");
		}else if (age>=13 && age<=19) {
			System.out.println(name+" you are a teenager");
		}else if (age>=20) {
			System.out.println("You are adult");
		}else 
			System.out.println("You ");
				
	}
}
