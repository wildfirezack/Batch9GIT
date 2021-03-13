package com.class11;

public class Task2 {

	public static void main(String[] args) {
		/* Create a 2D array where you wil store the following values: Mr, Mrs, Ms,
		 *  Miss and Smith, Jordan, Jackson, Obama. After storing values print the
		 *  following: Mrs Smith, Mr Obama, Ms JAckson, Miss Jordan.
		 */
		String[][] names= {
				{"Mr", "Mrs", "Ms", "Miss"},
				{"Smith", "Jordan", "Jackson", "Obama"},
		};
		
		String name=names[0][1] + " " + names[1][0];System.out.println(name);
		
		name=names[0][0] + " " + names[1][3];
		System.out.println(name);
	}

}
