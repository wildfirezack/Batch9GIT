package com.class07;

import java.util.Scanner;
public class Hw {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two numbers");
		
		System.out.println("Please enter an operator");
		char oper =input.next().charAt(0);
		double res;
		
		switch (oper) {
		
		case '+':
			res = num1 + num2;
				break;
		case '-':
			res = num1 - num2;
				break;
		case '/':
			res = num1 / num2;
				break;
		case '*':
			res = num1 * num2;
				break;
		default:
			res = 0;
		System.out.println("You eneter invalid operator");
			
		}
		if (res !=0) {
		System.out.println(num1 + " " + oper + " " +num2 + "=" + res);

		}
	}
}
