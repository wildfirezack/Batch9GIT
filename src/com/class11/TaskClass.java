package com.class11;

public class TaskClass {

	public static void main(String[] args) {
		
		String [][] cars = {
				{"Chevrolet", "Ford", "Dodge", "Chrysler", "Jeep"},
				{"Volvkswagen", "BMW", "Mercedes-Benz", "Porsche"},
				{"Kia", "Hyundai", "Daewoo", "SsangYong Motors"},
				{"Ferarri", "Alfa Romeo", "Lamborghini", "Maserati"},
		};
		
		for (int i=0; i<cars.length; i++) {
			for(int a=0; a<cars[i].length; a++) {
				System.out.print(cars[i][a]+ " ");
			}
			System.out.println();
		}

	}

}
