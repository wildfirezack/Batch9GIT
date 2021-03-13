package com.class07;

public class ClassHW {

	public static void main(String[] args) {
		System.out.println(" --------------WHAT IS THE OUTPUT ??----------------");
		int sum = 0;
		for (int i = 1; i <= 50; i++) {
			sum = sum + i;
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println(sum);
		System.out.println();
		System.out.println(" --------------WHAT IS THE OUTPUT ??----------------");
		int result = 0;
		for (int i1 = 1; i1 <= 49; i1 += 2) {
			result += i1;
			System.out.print(i1 + " ");
		}
		System.out.println();
		System.out.println(result);
		System.out.println();
	}
}
