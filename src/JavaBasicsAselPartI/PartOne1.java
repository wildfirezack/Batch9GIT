package JavaBasicsAselPartI;

public class PartOne1 {
	
	public static void main(String[] args) {

	int sum = 0;
	int[][] num = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };
	for (int[] i : num) {
		for (int j : i) {
			sum += j;
		}
	}
	System.out.print("The sum of all numbers is: " + sum);
	}
}
