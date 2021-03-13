package JavaBasicsAselPartI;

public class PartOne8 {

	public static void main(String[] args) {
		int array[] = { 14, 13, 1, 0, -2, 99, 33, 29, 7 };
		int max = array[0];
		int min = array[0];

		for (int b = 1; b < array.length; b++) {
			if (max < array[b]) {
				max = array[b];
			} else if (min > array[b]) {
				min = array[b];
			}
		}
		System.out.println("Maximum number is " + max);
		System.out.println("Minimum number is " + min);

		System.out.println();

	}

}
