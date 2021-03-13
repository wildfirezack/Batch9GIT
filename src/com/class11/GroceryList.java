package com.class11;

public class GroceryList {

	public static void main(String[] args) {
		String[][] groceries = {
				{"peppers", "squash", "tomatoes", "green beans"},
				{"apples", "oranges", "bananas", "pumpkins", "kiwi"},
				{"milk", "eggs", "cheese", " sour cream", "butter"},
				{"chocolates", "gummy bears", "swedish fish", "snickers"},
		};
		
		for (int a=0; a<groceries.length; a++) {
			for (int b=0; b<groceries[0].length; b++) {
				System.out.print(groceries[a][b] + " ");
			}
			System.out.println();
		}

	}

}
