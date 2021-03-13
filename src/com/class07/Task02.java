package com.class07;

public class Task02 {

	public static void main(String[] args) {
		// TODO Print Odd number between 20 and 50
		
		for ( int i = 20; i<=50; i++) {
			
			if (i % 2 ==1) {
				System.out.print(i + " ");
			}
		}
		System.out.println("---------------------------");
		
		for (int i=21; i<=50; i+=2) {
			System.out.print(i+ " ");
		}
		System.out.println();
		System.out.println("---------What is the output---------");
		
		int sum=0;
		
		for(int i=1; i<=5; i++) {
			sum=sum+1;
		}
		System.out.println(sum);
	}

}
