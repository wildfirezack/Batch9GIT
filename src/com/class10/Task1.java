package com.class10;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Create an array of chars
		 * and store grades into it: A,B,C,D,E,F.
		 * then print grade B
		 */

		char [] grade = new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		
		System.out.println("--------Another Way--------");
		
		char[] grades= {'A','B','C','D','E','F','G','H'};
		System.out.println(grade[1]);
		
		System.out.println(grades[6]);
		System.out.println("Number of elements in 2 array " + grades.length);
	}

}
