package com.class11;

public class NumberEight {

	public static void main(String[] args) {
		
		int[] num = {1, 2, 3, -7, 5, 6, 45, 8, 9, 10};
		int min=num[0], max=num[0];
		for (int i = 0; i<num.length; i++) {
			if(max<=num[i]) { 
				max=num[i];               
				if(min>=num[i]) { 
					min=num[i];
				}		
			}		
		}
		System.out.println(max + " is the largest number");
		System.out.println(min + " is the smallest number");
	}
}
