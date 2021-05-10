package ödevler;

import java.util.Scanner;

public class March21_Ödev7 {

	public static void main(String[] args) {
		 
		/*
				StringMethods:
					Çift uzunlukta bir degiskenin ilk yarısını konsolda yazdirmak için bir Java programı yazıniz.
			    	     ORNEK:
				     	INPUT      :  Python
					OUTPUT :   Pyt
			    */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir string giriniz");
		String str=scan.next();
		
		if (str.length()%2==0) {
			System.out.println(str.substring(0, str.length()/2));
		}
		
	}

}
