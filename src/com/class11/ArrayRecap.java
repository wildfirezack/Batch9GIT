package com.class11;


import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {
		/*
		 * We want to creata an array that will store 
		 */
		
		Scanner input;
		String element;
		String[] array;
		
		input=new Scanner(System.in);
		System.out.println("How many String elements would you like to store");
		int size=input.nextInt();
		
		array=new String[size];
		
		for (int i=0; i<size; i++) {
			System.out.println("Please enter a String");
			array[i]=input.next();
			
		}
		
			System.out.println("-------Let's see what we have stored------");
			
		for (String str:array) {
			System.out.println(str +" ");
		}
	}

}
