package com.class07;

public class LoopIntro {

	public static void main(String[] args) {
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");

		int time =11;

		if (time <12){
			System.out.println("Hello"); // code executes 1 time
		}

		while (time<12) {
			System.out.println("Hello"); //code runs forever
			time++;
		}
		
		/// print numbers 1-10
		
		int num = 1;
		
		while ( num < 11) {
			System.out.println(num);
			num++;
		}

		num=20;
		
		while (num<=40) {
			System.out.print(num + " ");
			num++;
		}
		System.out.println();
		System.out.println("-----------------------------------");
		
		
		int a = 10;
		
		while (a>=1) {
			System.out.println(a);
			a--;
		}
	}

}
 