package com.class08;

import java.util.Scanner;

public class DoWhileReview {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		int money;
		
		System.out.println("Please pay for soda");
		money= input.nextInt();
		
		while (money!=3) {
			if(money<3) {
				System.out.println("Please give more money");
			}else if(money>3) {
				System.out.println("Please give less money");
			}
			money=input.nextInt();
		}
			System.out.println("Thank you for your purchase");
	}

}
