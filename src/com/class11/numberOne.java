package com.class11;

public class numberOne {

	public static void main(String[] args) {
		
		int[][] num = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9},
		};
		
		int sum=0;
		
		for (int a=0; a<num.length; a++) {
					
			for(int b=0; b<num[a].length; b++) {
				sum+=num[a][b];
			
					
			}
				
			}
		
			System.out.print(sum);
		}
		

	}


