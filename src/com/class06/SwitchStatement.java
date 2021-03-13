package com.class06;

import java.util.Scanner;

public class SwitchStatement {
	public static void main(String[] args) {
		
	Scanner input;
	input=new Scanner(System.in);
		System.out.println("Please enter The day of the week.");
	
	byte day;
	
	day=input.nextByte();
		
		String weekDay;
		
		if (day == 1) {
			weekDay = "Monday";
			}else if (day == 2) {
				weekDay = "Tuesday";
			}else if (day == 3) {
				weekDay = "Wednesday";
			}else if (day == 4) {
				weekDay = "Thursday";
			}else if (day == 5) {
				weekDay = "Friday";
			}else if (day == 6) {
				weekDay = "Saturday";
			}else if (day == 7) {
				weekDay = "Sunday";
		}else {
			weekDay = "Invalid";
		}
		
		if(!weekDay.equals("Invalid")) {
			System.out.println("Today is " + weekDay);
		}
		
			System.out.println("-------Using SWitch-------");
			String weekDay1;
			
			switch (day) {
				
			case 1:
				weekDay1 = "Monday";
				break;
			case 2:
				weekDay1 = "Tuesday";
				break;
			case 3:
				weekDay1 = "Wednesday";
				break;
			case 4:
				weekDay1 = "Thursday";
				break;
			case 5:
				weekDay1 = "Friday";
				break;
			case 6:
				weekDay1 = "Saturday";
				break;
			case 7:
				weekDay1 = "Sunday";
				break;	
			default:
				weekDay1="Invalid";
}
			if(!weekDay.equals("Invalid")) {
				System.out.println("Today is " +weekDay1);
			}
}}