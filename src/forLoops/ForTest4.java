package forLoops;

public class ForTest4 {

	public static void main(String[] args) {

		int a, b, c;
		a = 0;
		int sum = 0;

		for (int cntr = 1; cntr <= 5; cntr++) {

			if (cntr == 1) {
				a = b = c = 1;
				sum = sum + a + b + c;
				a = 0;

			} else if (cntr > 1) {
				b = a + 1;
				c = b + 1;

				sum = sum + a + b + c;
				a++;
			}

		}
		System.out.println("Sum = " + sum);
	}

}
