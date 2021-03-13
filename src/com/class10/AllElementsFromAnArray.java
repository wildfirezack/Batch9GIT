package com.class10;

public class AllElementsFromAnArray {

	public static void main(String[] args) {
		
		int[] numbers= {10, 14, 78, 5, 90, 76};
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i] + " ");
		}
System.out.println("---Print in Reverse");

for ( int i=numbers.length-1; i>=0; i--) {
	System.out.println(numbers[i] + " ");
}
	}

}
