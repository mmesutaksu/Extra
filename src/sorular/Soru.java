package sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soru {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir String Giriniz");
		String str=scan.nextLine();
		String ters="";
		
		for (int i=0; i<str.length(); i++) {
			
			ters+=str.charAt(str.length()-i-1);
		}
		System.out.println(ters);
	}

}
