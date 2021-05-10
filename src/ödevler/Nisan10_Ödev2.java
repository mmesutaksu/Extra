package ödevler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Nisan10_Ödev2 {

	String str;
	
	public static void main(String[] args) {
		  

		 /*  Rastgele kullanıcı adı oluşturan JAVA kodu yazınız.
			 *  1. Adım : Kullanıcıdan ismini isteyelim
			 *  2. Adım : Kullanıcı adındaki boşlukları silelim.
			 *  3. Adım : Kullanıcı adının alınabilir olup olmadığına bakalım.
			 *  4. Adım : Eğer bizim listemizde öyle bir kullanıcı adı yoksa kullanıcı adı, kullanıcının girdiği isim olsun.
			 *  5. Adım : Eğer bu kullanıcı adı zaten varsa, sonuna rastgele sayı oluşturup ekleyelim, ve gösterelim.
				List<String> veritabanindakiKullaniciListesi = new ArrayList<>();
				veritabanindakiKullaniciListesi.add("Ahmet");
				veritabanindakiKullaniciListesi.add("Ayşe");
				veritabanindakiKullaniciListesi.add("Süleyman");
				veritabanindakiKullaniciListesi.add("Nazmi");
			 */
		
		List<String> list = new ArrayList<>();
		list.add("Ahmet");
		list.add("Ayse");
		list.add("Süleyman");
		list.add("Nazmi");
		
		Scanner scan=new Scanner(System.in);
		System.out.println("isminizi giriniz");
		String isim=scan.nextLine().replaceAll("\\W", "");
		int sayi=2;
		String flag=isim;
				
		for (int i = 0; i < list.size(); i++) {
			if (isim.equalsIgnoreCase(list.get(i))) {
				flag=isim+sayi;
				
			}
		}
		
		System.out.println(flag);	
		
			
		
		
	}

}
