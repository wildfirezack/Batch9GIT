package com.class06;

import java.util.Scanner;

public class Example {

    

	public static void main(String[] args) {
		
		Scanner	input;
		float price;
		String item;
		boolean sale;
		
		input=new Scanner(System.in);
		
		System.out.println("Is there a sale? Please enter true or false");
		sale=input.nextBoolean();
		
		System.out.println("What is the item?");
		item=input.next();
		
		System.out.println("What is the price?");
		 price=input.nextFloat();
		 
		 float finalPrice=price;
		
		if(sale) {
			
			 if (price < 10) {
				 finalPrice = (price*.95f);
				 
			}else if (price >10 && price <100) {
				finalPrice = (price*.90f);
				
			}else if (price >100 && price <500) {
				finalPrice = (price*.80f);
				
			}else if (price >500) {
				finalPrice = (price*.70f);
				
			}
			 finalPrice=(finalPrice*1.00f);

			 System.out.println("The item: " +item+ " with an original price of " +price+ " is on sale today for " +String.format("%.2f", finalPrice ));
		}
		
		else {
			System.out.println("I will not go shopping");
		
}
}
}