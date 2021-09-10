package forLoops;

public class ForTest9 {

	public static void main(String[] args) {
		/*
		 * factorial
		 */
		int a = 5;
		int fac = 1;
		for (int i = 1; i <= a; i++) {
			fac *= i;
			System.out.println("factorial value of " + i + " = " + fac);
		}
	}
}
