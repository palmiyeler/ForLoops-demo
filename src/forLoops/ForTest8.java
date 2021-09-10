package forLoops;

public class ForTest8 {

	public static void main(String[] args) {
		/*
		 * cift sayilar carpim tablosu
		 */
	int a=8;
		
		if (a%2==0) {
			for (int i=1; i<=10; i++) {
				System.out.println("a * "+i+" = "+a*i);
				
			}
		} else {
			System.out.println("Please choose even number!!");
			
		}
	}

}
