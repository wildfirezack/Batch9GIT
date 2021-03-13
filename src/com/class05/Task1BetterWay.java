package com.class05;

import java.util.Scanner;

public class Task1BetterWay {

	public static void main(String[] args) {
		
		Scanner pp = new Scanner(System.in);
		int height;
		
		System.out.println("Pleae enter your height in inches");
		height = pp.nextInt();
		
		String definition;
		
		if (height <= 60) {
			definition="short";
			
		} else if (height > 60 && height <= 72) {
			definition = "medium";
			
		}else {
			definition = "tall";
		}
		System.out.println("You are person who's height is " + definition);
		

	}

}
