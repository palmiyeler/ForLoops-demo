package forLoops;

public class ForTest3 {

	public static void main(String[] args) {

		int sum = 0;
		int i;
		for ( i = 1; i <= 5; i++) {

			sum = sum + i;
		}
		System.out.println("at the end of app, value of i = "+i);
		System.out.println("sum = " + sum);
	}

}
