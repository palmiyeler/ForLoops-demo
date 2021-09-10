package forLoops;

public class ForTest7 {

	public static void main(String[] args) {
		/*
		 * 3 kardes var. kardeslerin yaslari toplami 100den kucuk. kardesler arasi yas
		 * iliskisi su sekilde; 1. kardesin yasi ikinin bir kati, 2. kardesin yasi
		 * 1.kardesin yasinin iki katindan 4 eksik, 3. kardesin yasi 1.kardesin yasindan
		 * 17 fazla, kardeslerin yaslari ve toplamlari ne olabilir?
		 */

		int sum = 0;
		int y, z;
		for (int x = 0; sum < 100; x++) {
			y = 2 * x - 4;
			z = x + 17;
			sum = x + y + z;
			if (x % 2 == 0 && y > 0 && z > 0 && sum < 100) {
				System.out.println("1. kardes yasi = " + x);
				System.out.println("2. kardes yasi = " + y);
				System.out.println("3. kardes yasi = " + z);
				System.out.println("Kardeslerin yaslari toplami = " + sum);
			}
		}
	}
}
