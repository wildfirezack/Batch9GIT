package com.class11;

public class NumberSeven {
	
	public static void main(String[] args) {
		
		System.out.println("Fibonacci Sequence");
		int d=0, e=1;
		for(int i=1; i<10; i++) {
			System.out.print(d +" ");
			d=d+e;
			e=d-e;
		}
	}
}
