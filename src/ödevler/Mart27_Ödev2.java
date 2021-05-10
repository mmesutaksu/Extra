package ödevler;

public class Mart27_Ödev2 {

	public static void main(String[] args) {
		/*
		1-20 arasindaki -20 dahil olmak üzere-  çift sayıları yazdırın. e.g.2 4 6 .. 20

		1-20 arasindaki -20 dahil olmak üzere-  tek sayıları yazdırın. e.g 1,3,5,7,...,19 Virgul dahil!

		20 ile 1 arasindaki 5 e bolunebilen sayillari 20 den geriye gelerek yazdirin. e.g.20,15,10,5
		 
		1 - 20 arasındaki tüm çift sayıların toplamını bulun.

		11 veya 15 hariç 1-20 arasındaki tüm sayıları yazdırın; break or continue kullanin. 
		*/
		
		for (int i = 2; i <= 20; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i = 1; i <= 20; i+=2) {
			System.out.print(i+",");
		}
		System.out.println();
		
		for (int i = 20; i > 1; i-=5) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		int toplam=0;
		for (int i = 2; i <= 20; i+=2) {
			toplam+=i;
		}
		System.out.println(toplam);
		
		for (int i = 1; i < 21; i++) {
			if (i==11) {
				continue;
			}
			System.out.print(i+",");
		}
	}

}
