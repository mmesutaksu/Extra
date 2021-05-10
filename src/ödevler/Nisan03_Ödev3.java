package ödevler;

import java.util.Arrays;
import java.util.Scanner;

public class Nisan03_Ödev3 {

	public static void main(String[] args) {
		 /*
         * SORU 3) Kullanicidan 100 den kucuk bir tamsayi isteyip, bu sayinin daha
         * onceden tanimlanmis array’de olup olmadigini kullaniciya donen bir method
         * yaziniz
         *
         * Array={3,5,21,32,34,45,56,57,76,87,95}
         *
         * Input : 5  Output: Girdiginiz sayi Arrayde var
         * Input : 15 Output: Girdiginiz sayi Arrayde yok
         */
		
		int[] arr={3,5,21,32,34,45,56,57,76,87,95};
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen 100'den kücük bir tamsayi giriniz");
		int sayi=scan.nextInt();
		
		arrayIcindeAra(arr,sayi);
		
	}

	public static void arrayIcindeAra(int[] arr, int sayi) {
		if (Arrays.binarySearch(arr, sayi)>=0) {
			System.out.println("Girdiginiz sayi Arrayde var");
		} else {
			System.out.println("Girdiginiz sayi Arrayde yok");
		}
		
	}

}
