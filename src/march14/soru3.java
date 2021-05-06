package march14;

import java.util.Scanner;

public class soru3 {

	public static void main(String[] args) {
		 /*
        “NestedIfStatements” class olusturun.
        Kullanicidan 2 kisi icin dogum gunu girmesini isteyin.
        Yılı, ayi ve günü tamsayı olarak alın e NestedIf kullanarak kimin yas olarak daha buyuk oldugunu ekrana yazdirin. 
        Examples:
        int birthYearOfYusuf=2000, birthMonthOfYusuf=12, birthDayOfYusuf=12,
        int birthYearOfMehmet=2000,birthMonthOfMehmet=12, birthDayOfMehmet=21;
        Yusuf is Older            
        */
        
        System.out.println("Kimin daha buyuk oldugunu bulmamiz icin lutfen sorulari dogru sekilde cevplayin");
        Scanner scan = new Scanner(System.in);
        System.out.println("1. kisinin adini yaziniz");
        String isim1 = scan.nextLine();
        System.out.println("2. kisinin adini yaziniz");
        String isim2 = scan.nextLine();
        System.out.println("1. kisinin hangi gun dogdugunu sayi ile yaziniz");
        int gun1 = scan.nextInt();
        System.out.println("1. kisinin hangi ay dogdugunu sayi ile yaziniz");
        int ay1 = scan.nextInt();
        System.out.println("1. kisinin hangi yil dogdugunu sayi ile yaziniz");
        int yil1 = scan.nextInt();
        System.out.println("1. kisinin verilerini not ettik . Simdi 2.sine gecelim");
        System.out.println("2. kisinin hangi gun dogdugunu sayi ile yaziniz");
        int gun2 = scan.nextInt();
        System.out.println("2. kisinin hangi ay dogdugunu sayi ile yaziniz");
        int ay2 = scan.nextInt();
        System.out.println("2. kisinin hangi yil dogdugunu sayi ile yaziniz");
        int yil2 = scan.nextInt();
        
        /*
         * yil1<yil2 1. kisi buyuk
         * yil2<yil1 2. kisi buyuk
         * yil1=yil2 ise ay1<ay2 1.kisi buyuk || ay2<ay1 2. kisi buyuk || ay2==ay1 ise gun1<gun2 1.kisi buyuk || gun2<gun1 2.kisi buyuk
         * hepsi esit ise ayni yastalar
         * else tekrar deneyin
         */
        
        if (yil1<=0 || yil2<=0 || ay1<=0 || ay1>=12 || ay2<=0 || ay2>=12 || gun1<=0 || gun1>=31 || gun2<=0 || gun2>=31) {
            System.out.println("Lutfen gecerli gun , ay ve yil giriniz");
        } else if (yil2<yil1) {
            System.out.println(isim2.toLowerCase() + " Daha buyuktur");
        } else if (yil1<yil2) {
            System.out.println(isim1.toLowerCase() + " Daha buyuktur");
        } else if (yil1==yil2) {
            if (ay1<ay2) {
                System.out.println(isim1.toLowerCase() + " Daha buyuktur");
            } else if (ay2<ay1) {
                System.out.println(isim2.toLowerCase() + " Daha buyuktur");
            } else if (ay1==ay2) {
                if (gun1<gun2) {
                    System.out.println(isim1.toLowerCase() + " Daha buyuktur");
                } else if (gun2<gun1) {
                    System.out.println(isim2.toLowerCase() + " Daha buyuktur");
                } else {
                    System.out.println(isim1.toLowerCase() + " ve " + isim2.toLowerCase() + " ayni yastalar");
                }
            }
        } else {
            System.out.println("Bir hata oldu lutfen bastan deneyiniz..");
        }


	}

}
