package com.class11;

public class TwoDArray {

	public static void main(String[] args) {
		
		int [] [] num=new int[3] [4];
		
		//1 array or row 1
		num[0][0]=1;
		num[0][1]=2;
		num[0][2]=3;
		num[0][3]=4;
		
		
		//2 array or row 2
		num[1][0]=10;
		num[1][1]=20;
		num[1][2]=30;
		num[1][3]=40;
		
		//3 array or row 3
		
		num[2][0]=100;
		num[2][1]=200;
		num[2][2]=300;
		num[2][3]=400;
		
		System.out.println(num[1][3]);//40
		System.out.println(num[2][2]);//300)

		
		
		System.out.println("Another way of creating a 2D array");
		
		int[][] numbers= {
				{1, 2, 3, 4},
				{10, 20, 30, 40},
				{100, 200, 300}
						};
		
		System.out.println(numbers[0][2]);//3
		System.out.println(numbers[1][1]);//20
		
		//what is the output?
		
	int sum=numbers[1][2] +numbers[0][3];
	System.out.println(sum);
	
	//what is the output?
	System.out.println(numbers[0][4]); //out of bounds for length 4
		
	}

}
