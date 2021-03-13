package com.class07;

import java.util.Scanner;

public class HwUsingIfElse {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter two numbers");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		
		System.out.println("please enter an operator");
		char oper = input.next().charAt(0);
		double res;
		
		if (oper == '+') {
			res = num1 + num2;
		}else if (oper == '-') {
			res = num1 - num2;
		}else if (oper == '*') {
			res = num1 * num2;
		}else if (oper == '/') {
			res = num1 / num2;
		}else {
			res = 0;}
System.out.println("");
	}

}
