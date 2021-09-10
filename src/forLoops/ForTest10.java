package forLoops;

public class ForTest10 {

	public static void main(String[] args) {
		/*
		 * uslu sayi
		 */
		int kuvvet, sayi;
		kuvvet = 4;
		sayi = 5;
		int sonuc = 1;

		for (int i = 1; i <= kuvvet; i++) {
			sonuc = sonuc * sayi;
		}
		System.out.println(sayi + " sayisinin " + kuvvet + ". kuvveti = " + sonuc);
	}

}
