package forLoops;

public class ForTest6 {

	public static void main(String[] args) {

		int sum = 0;
		int a = 4;

		for (int i = 1; i <= 20; i++) {
			if (i % a == 0) {
				int cntr = i / a;
				System.out.println("i(" + cntr + ") = " + i);
				sum = sum + i;
			}
		}
		System.out.println("Sum of i = " + sum);
	}
}
