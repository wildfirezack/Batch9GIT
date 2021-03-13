package com.class06;

import java.util.Scanner;

public class SwitchExamples {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter Gender type; (M or F)");
		
		char gender; 
		gender = input.next().charAt(0);
		
		String description;
		
		switch(gender) {
		
		case 'M':
			description = "Male";
		break;
		
		case 'F':
			description = "Female";
			break;
			
		default:
			description = "N/A";
		
		}

		System.out.println(description);
	}

}
