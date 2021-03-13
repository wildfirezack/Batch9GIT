package com.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		/* variable day
		 * 
		 * if day is Tuesday or Wednesday --> Manual Class
		 * If day Monday or Friday --> no class
		 * if day is saturday or sunday --> class
		 * If day is thursday --> Review class
		 *
		 */
		String day;
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("What day is it?");

		day=scan.nextLine();
	
		
		if (day.equals("Monday") || day.equals("Friday")) {
			System.out.println("Today I have no Class");
			
		}else if (day.equals("Tuesday") || day.equals("Wednesday")) {
				System.out.println("Today I have Manual class");
				
		}else if (day.equals("Thursday")) {
					System.out.println("Today I have review class");
			
		}else if (day.equals("Saturday") || day.equals("Sunday")) {
				System.out.println("Today I have Java class");
		}else {
			System.out.println(day +" is invalid");
		}
		
	}

}
