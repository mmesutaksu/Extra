package sorular;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mart22_ManavSorusu {
		/*
	     * Basit bir manav alisveris programi yaziniz.
	     *
	     * 1. Adim : �r�n listesinden �r�n se�tir ve ka� kilo oldugunu sor.
	     * 2. Adim : Baska bir �r�n almak isteyip istemedigini sor.
	     *           Istemiyorsa toplam miktari g�ster, istiyorsa tekrar �r�n se�tir.
	     *           Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
	     * 3. Adim : Muster her �r�n se�tiginde, ald��� �r�n�n fiyatini toplam fiyata ekle.
	     * 4. Adim : Alisveris bitince toplam �demesi gereken tutari g�ster.
	     *
	     * */
	    
	    static List<String> urunIsimleri = new ArrayList<>();
	    static List<Double> urunFiyatlari = new ArrayList<>();
	    static double toplamOdenecekFiyat = 0;
	  
	    public static void main(String[] args) {
	        
	        urunIsimleri.add("Domates - Urun Kodu : 0");
	        urunIsimleri.add("Patlican - Urun Kodu : 1");
	        urunIsimleri.add("Karpuz - Urun Kodu : 2");
	        urunIsimleri.add("Biber - Urun Kodu : 3");
	        urunIsimleri.add("Erik - Urun Kodu : 4");
	        urunIsimleri.add("Armut - Urun Kodu : 5");
	        
	        urunFiyatlari.add(4.5);
	        urunFiyatlari.add(5.40);
	        urunFiyatlari.add(1.25);
	        urunFiyatlari.add(1.75);
	        urunFiyatlari.add(6.56);
	        urunFiyatlari.add(3.78);
	        
	        urunSec();
	        
	        
	    }
	    
	    //1. Adim : �r�n listesinden �r�n se�tir ve ka� kilo oldugunu sor.
	    public static void urunSec() {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Asagidaki listeden sectiginiz urunun \n "
	                + "Urun kodunu ve kac kilo almak istediginizi giriniz \n" + urunIsimleri);
	        
	        int urunKodu = scan.nextInt();
	        double kilo = scan.nextDouble();
	        
	        
	        double toplamUrunFiyati = urunFiyatlari.get(urunKodu) * kilo;
	        toplamOdenecekFiyat += toplamUrunFiyati;
	        
	        System.out.println("Aldiginiz " + urunIsimleri.get(urunKodu) + "\n" + toplamUrunFiyati + " TL");
	        System.out.println("Alisverise devam etmek ister misiniz? E/H");
	        char karar = scan.next().toUpperCase().charAt(0);
	        
	            if(karar == 'H') {
	                System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz.\n" +
	                        "Odemeniz gereken tutar :" + toplamOdenecekFiyat);
	            }else if(karar == 'E'){
	                urunSec();
	            }else {
	                System.out.println("Yanlis tusa bastiniz");
	            }

		
	}

}
