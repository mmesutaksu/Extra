package ödevler;

import java.util.Scanner;

public class March21_Ödev3 {

	public static void main(String[] args) {
		/*
		Ternary kullanarak:
				int variable : FIYAT
				string variable : Secim (String Secim=.....)
				price = $10 ise Print “UCUZ”
				price 10-$20 arasi ise Print “UYGUN”
				diger durumlar icin “PAHALI” yazdirin.
			*/
		
		System.out.println("Lutfen price giriniz");
        Scanner scan = new Scanner(System.in);
        int price= scan.nextInt();
        String secim= price==10 ? "Ucuz" : price>10 && price<20 ? "Uygun" : price>=20 ? "expensive" : "Tekrar giriniz";
        
        
        System.out.println(secim);
		
		
		
	}

}
