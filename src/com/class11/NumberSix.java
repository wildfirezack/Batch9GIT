package com.class11;

import java.util.Scanner;

public class NumberSix {

	public static void main(String[] args) {
	
		Scanner input= new Scanner(System.in);
		
		System.out.println("Please enter a number");
		
		int num=input.nextInt();
		
		if(num%2!=0 || num==2) {
			
			if (num%3==0 || num%5==0 || num%7==0 || num%11==0 || num==2) {
				
			System.out.println("This is a prime number");
			}
			
		}else {System.out.println("This is not a prime number");}
		
		
		
		
		
	}

}
