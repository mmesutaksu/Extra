package ödevler;

import java.util.Scanner;

public class Nisan03_Ödev2 {

	public static void main(String[] args) {
		/* Kullanicidan sayilar girmesini isteyin
         * ve girdigi sayilari toplayip yazdirin.
         * yeni sayi isteyin
         * girilen sayilarin toplami 100 'u gecerse
         * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
         *
         */
		
		Scanner scan=new Scanner(System.in);
		int toplam=0;
		int sayac=0;
		do {
			sayac++;
			System.out.println("Lütfen toplamak istediginiz bir sayi giriniz: ");
			toplam+=scan.nextInt();
			System.out.println("Toplam: "+toplam);
			System.out.println("=====================");
		} while (toplam<100);
		
		System.out.println(sayac+" adet sayi girdin. Bu kadar sayi yeter.");
		
		scan.close();
	}

}
