package com.class11;

public class NumberThree {

	public static void main(String[] args) {
		
		int even=0;
		int odd=0;
	
		
		int[][] num = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12},

		};		
		
		for(int a=0; a<num.length; a++) {
			for (int b=0; b<num[a].length; b++) {
				if(num[a][b]%2==0) { even+=num[a][b];
				
			}else {
				odd+=num[a][b];
				}
			}

		}
		 System.out.println(" The sum of all even numbers is " + even );
		 System.out.println(" The sum of all odd numbers is " + odd );
		 
	}
}
