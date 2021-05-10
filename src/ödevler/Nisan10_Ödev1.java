package ödevler;

public class Nisan10_Ödev1 {

	public static void main(String[] args) {
		/*
		//Swap islemini iki yoldan yaptiginiz java kodunu yaziniz.
				//1.Yol: 3. degisken kullanarak 
				//2.Yol: 3. degisken kullanmadan
		*/
		int sayi1=1;
		int sayi2=2;
		int swap=0;
		
		System.out.println(" ========================");
		System.out.println("|Swap'tan önce  1.Sayi: "+sayi1+"|");
		System.out.println("|Swap'tan önce  2.Sayi: "+sayi2+"|");
		
		swap=sayi1;
		sayi1=sayi2;
		sayi2=swap;
		System.out.println(" ========================");
		
		System.out.println("|Swap'tan sonra 1.Sayi: "+sayi1+"|");
		System.out.println("|Swap'tan sonra 2.Sayi: "+sayi2+"|");
		
		System.out.println(" ========================");
	}

}
