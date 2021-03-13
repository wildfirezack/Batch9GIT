package com.class05;

public class ifWithNoBraces {

	public static void main(String[] args) {
		
		String day="friday";
		
		System.out.println("----If without braces----");
		
		if(day.equalsIgnoreCase("Friday"))
			
			System.out.println("Today is my movie day");
		
		System.out.println("Tomorrow I have a class at Syntax");
		
		System.out.println("-----If with braces----");
		
		if(day.equalsIgnoreCase("Friday")) {
			
			System.out.println("Today is my movie day");
		
			System.out.println("Tomorrow I have a class at Syntax");
		}
			
		System.out.println("-----End of the Program-----");

		int num=10;
		
		if(num>10)
			System.out.println("Number is larger than 10");
		else //if no braces java identofies only 1 statement per block (if block or else block)
			System.out.println("Number is less than 10");
			System.out.println("Second statement inside else block");
			
	}

}
