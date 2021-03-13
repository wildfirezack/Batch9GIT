package com.class08;

import java.util.Scanner;

public class WhileLoopReview {

	public static void main(String[] args) {
		/*
		 * We need to make a user pay for a soda
		 * keep asking user to pay you until it enters 3
		 * 
		 * if used gives more than 3 ---->please give less money
		 * if used gives less than 3 ----> please give more money
		 * 
		 */
		Scanner input=new Scanner(System.in);
		int money;
		System.out.println("Please pay for soda");
		
		do {
		
			money = input.nextInt();
		
			if(money<3) {
				System.out.println("Please give more money");
			}else if (money>3) {
				System.out.println("Plese enter less money");
			}
		}while (money!=3);
		System.out.println("Thank you for your purchase");
		
	}
}
