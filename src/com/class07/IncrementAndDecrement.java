package com.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		
		int z=10;
		z=z+1;
		
		z+=1;
		System.out.println(z);
		z++; //increment operator ---> adds 1 to the variable
		System.out.println(z);
		
		int x=20;
		x-=1;
		x--;//decrement operator ---> subtracts one from the variable
		System.out.println(x);
		
		//100++; Compiler Error
		// incrememnt and decrement operator can only be used with variables
	}

}
