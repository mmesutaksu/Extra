package ödevler;

import java.util.Scanner;

public class Nisan03_Ödev1 {

	public static void main(String[] args) {
		/*
		// Stringi ters çevirmek için bir Java Programı yazın
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method oluşturun, ardından methodu main method dan çağırın
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir String giriniz");
		String str=scan.nextLine();
		StringBuilder strb=new StringBuilder();
		StringBuilder strb2=new StringBuilder(str);
		
		birinciCözüm(str,strb);
		
		System.out.println("---------------------------");
		
		ikinciCözüm(str,strb2);
		
	}
	public static void birinciCözüm(String str, StringBuilder strb) {
		
		for (int i =str.length()-1; i>=0; i--) {
			strb=strb.append(str.substring(i,i+1));
		}		
		System.out.print("Birinci cözüm: ");
		System.out.println(strb);
	}
	public static void ikinciCözüm(String str, StringBuilder strb2) {
		
		System.out.print("Ikinci cözüm : ");
		System.out.println(strb2.reverse());
		
	}
	

}
