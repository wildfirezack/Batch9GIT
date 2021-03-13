package JavaBasicsAselPartI;

import java.util.Scanner;

public class PartOne6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean isPrime = true;

		System.out.println("Enter a number: ");
		int num = input.nextInt();
		if (num < 2) {
			isPrime = false;
		}
		for (int i = 2; i <= (num / 2); i++) {
			if ((num % i) == 0) {
				isPrime = false;
			}
		}
		if (!isPrime) {
			System.out.println("The number " + num + " is not a prime number.");
		} else {
			System.out.println("The number " + num + " is a prime number.");
		}

	}
}