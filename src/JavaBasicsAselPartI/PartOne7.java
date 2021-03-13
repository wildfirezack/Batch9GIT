package JavaBasicsAselPartI;

public class PartOne7 {

	public static void main(String[] args) {
		System.out.println("Fibonacci Sequence");
		int a = 0, b = 1;
		for (int c = 1; c < 10; c++) {
			System.out.print(a + " ");
			a = a + b;
			b = a - b;
		}

	}

}
