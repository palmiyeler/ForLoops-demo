package forLoops;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		System.out.print("Metin gir   : ");

		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();		 // srtring olusturma
		scn.close();

		StringBuilder abc = new StringBuilder();
		abc.append(str);
		abc.reverse(); 						// olusturulan stringin tersi
		String rvrs = abc.toString();

		System.out.println("Metnin tersi: "+rvrs);

		if (str.equals(rvrs)) {
			System.out.println(str + " bir palindromdur."); 	  // tersi ve kendisinin
		} else { 												  // icerikte ayni olmasi
			System.out.println(str + " bir palindrom degildir."); // karsilastiriliyor

		}
	}

}
