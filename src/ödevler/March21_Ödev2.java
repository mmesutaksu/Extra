package �devler;

import java.util.Scanner;

public class March21_�dev2 {

	public static void main(String[] args) {
		/*  
		* Kullanicinin girmis oldugu ay icin kac gun oldugunu yazdiran Switch Case java kodunu yaziniz.
			*/
		Scanner scan=new Scanner(System.in);
		System.out.println("Kac g�n oldugunu g�rmek istediginiz ayi rakamla giriniz");
		String ay=scan.next();
		
		switch (ay) {
		case "1":
			System.out.println("31 G�n");
			break;
		case "2":
			System.out.println("28 G�n");
			break;
		case "3":
			System.out.println("31 G�n");
			break;
		case "4":
			System.out.println("30 G�n");
			break;
		case "5":
			System.out.println("31 G�n");
			break;
		case "6":
			System.out.println("30 G�n");
			break;
		case "7":
			System.out.println("31 G�n");
			break;
		case "8":
			System.out.println("31 G�n");
			break;
		case "9":
			System.out.println("30 G�n");
			break;
		case "10":
			System.out.println("31 G�n");
			break;
		case "11":
			System.out.println("30 G�n");
			break;
		case "12":
			System.out.println("31 G�n");
			break;
		default:
			System.out.println("L�tfen tekrar giriniz");
			break;
		}
		
	}

}
