package forLoops;

public class ForTest2 {

	public static void main(String[] args) {

		int a = 0;
		int sum1 = 0;
		for (int counter = 1; counter <= 5; counter++) {

			a = a + 1;
			sum1 = sum1 + a;

			System.out.println(a);

		}
		System.out.println(sum1);

		int x, y, z;
		x = 5;
		y = 10;
		z = -15;
		int sum;

		for (int cntr = 1; cntr <= 5; cntr++) {
			sum = x + y + z;
			if (sum > 0) {
				System.out.println("x+y+z=" + sum);
			} else if (x * y > 100 || y * z < 100) {
				System.out.println("else if");
			} else {
				System.out.println("last option");
			}
			x = x + 2;
			y = y + 3;
			z = z + 4;

		}

	}

}
