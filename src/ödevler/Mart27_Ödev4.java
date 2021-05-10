package ödevler;

import java.util.Scanner;

public class Mart27_Ödev4 {

	public static void main(String[] args) {
		/*
		Get numbers from the user and output that number consecutive fibonacci number sequence
		     	e.g : User enters 10
		output : 0 1 1  2  3  5 8 13 21 34
		      	*/
		Scanner scan= new Scanner(System.in);
        System.out.println("kac sayı gir");
                int sayi = scan.nextInt();
                int t1 = 0, t2 = 1;
                for (int i = 1; i <sayi; ++i)
                {
                    System.out.print(t1 + " + ");
                    int sum = t1 + t2;
                    t1 = t2;
                    t2 = sum;
                }

		
		
	}

}
