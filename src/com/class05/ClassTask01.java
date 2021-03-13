package com.class05;

import java.util.Scanner;

public class ClassTask01 {

	public static void main(String[] args) {
	
		Scanner input;
		int height;
		
		input=new Scanner(System.in);
		System.out.println("Enter your height");
		
		height=input.nextInt();
		
		if(height<=60) {
			System.out.println("You are short");
			
		}else if(height>=61 && height<=72) {
			System.out.println("You are medium");
			
		} else if(height>=73) {
			System.out.println("You are tall");
		}



	}

}
