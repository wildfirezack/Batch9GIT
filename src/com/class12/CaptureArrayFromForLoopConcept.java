package com.class12;


import java.util.Scanner;

public class CaptureArrayFromForLoopConcept {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		int[] a=new int[5];
		
		for(int z=0; z<5; z++) {
			
			
			
			
			for (int print : a) {
				System.out.print(print +" ");
			
		}
		
		
		

			
			int[] arr = new int[4]; // here the array of 4 spaces is created
			System.out.print("Please enter 4 integers: ");
			for (int i = 0; i < arr.length; i++) { 
				// here we use "i" to set the numbers entered in keyboard to the array 
				arr[i] = input.nextInt();
			}
			for (int print : arr) {
				System.out.print(print);
				//here we use the enhanced for to print
			


	}
}}}
