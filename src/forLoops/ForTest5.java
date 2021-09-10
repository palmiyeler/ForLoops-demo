package forLoops;

public class ForTest5 {

	public static void main(String[] args) {

		int sumEven = 0;
		int sumUneven = 0;

		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sumEven = sumEven + i;
			} else if (i % 2 == 1) {
				sumUneven = sumUneven + i;
			}
		}
		System.out.println("Sum of Even Numbers....= " + sumEven);
		System.out.println("SUm of Uneven Numbers..= " + sumUneven);
	}

}
