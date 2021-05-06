package march14;

import java.util.Scanner;

public class soru4 {

	public static void main(String[] args) {
		/* 
        Kullanicidan 3 tane pozitif  tam sayi alalim
        bu uc sayidan ucgen olup olmama durumunu kontrol edelim
        eger ucgen olabiliyor ise, es kenar ucgen mi kontrol edelim.
        * Ucgen olma kosullari.
        b+c > a > b-c  1    /////               
        a+c>b>a-c  1
        a+b>c>a-b  1
        * Eskenar ucgen olma kosullari.
        a=b=c 
        Konsolda asagidaki durumlari yazdiralim.
        Eskenar ucgen
        Sadece ucgen
        Ucgen degildir
                 */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Merhaba. Lutfen yazacaginiz sayilar, pozitif tam sayilar olsun");
        System.out.println("Lutfen 1. kenari giriniz");
        int a = scan.nextInt();
        System.out.println("Lutfen 2. kenari giriniz");
        int b = scan.nextInt();
        System.out.println("Lutfen 3. kenari giriniz");
        int c = scan.nextInt();
        
        if (a>0 && b>0 && c>0) {                                           
            if ((a+b>c && a-b<c) || (a+c>b && a-c<b) || (c+b>a && c-b<a)) { // b+c>a>b-c // a+c>b>a-c // a+b>c>a-b
                if (a==b && b==c && a==c) {
                    System.out.println("Eskenar Ucgendir");
                } else if ((a==b && a!=c) || (a==c && a!=b) || (b==c && a!=c)) {
                    System.out.println("Ikizkenar ucgendir");
                } else if (a!=b && a!=c && b!=c) {
                    System.out.println("Normal ucgendir");
                }
            } else {
                System.out.println("Bu degerlerle bir ucgen olusturulamaz");
            }
        } else {
            System.out.println("Lutfen pozitif tamsayilar giriniz");
        }
        
        // 2 1 1 ucgen olusturmaz
        
        scan.close();  

	}

}
