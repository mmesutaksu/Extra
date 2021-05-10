package ödevler;

import java.util.Scanner;

public class March21_Ödev5 {

	public static void main(String[] args) {
		/*
		Kullanıcıdan bir kelime girmesini isteyin. Sözcükte tek sayıda karakter ve 3 veya daha fazla karakter içeriyorsa, kelimenin ortasındaki karakteri yazdırın.
		*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir kelime giriniz");
		String str=scan.next().toLowerCase();
		
		if (str.length()%2!=0 && str.length()>=3) {
			
			System.out.println(str.substring ((str.length()-1)/2,(str.length()+1)/2));
		
		} else {
			
			System.out.println("Lütfen karakter sayisi tek olan en az 3 karakterli bir kelime giriniz");
		}
		
	}

}
