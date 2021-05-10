package ödevler;

import java.util.Scanner;

public class March21_Ödev6 {

	public static void main(String[] args) {
		/* 
		Kullanıcıdan firstName ve lastName'i girmesini isteyin, ardından baş harflerini büyük harf yapın ve geri kalanı tamamen kucuk harf olarak konsolda yazdirin.          
		ferhat => Ferhat
		          	kirac => Kirac
		          */
		Scanner scan=new Scanner(System.in);
		System.out.println("Adiniz: ");
		String ad=scan.nextLine().toLowerCase();
		System.out.println("Soyadiniz: ");
		String soyad=scan.nextLine().toLowerCase();
		
		System.out.print("Adiniz ve Soyadiniz: ");
		System.out.println(ad.toUpperCase().charAt(0)+ad.substring(1, ad.length())+" "+soyad.toUpperCase().charAt(0)+soyad.substring(1, soyad.length()));
		
		
	}

}
