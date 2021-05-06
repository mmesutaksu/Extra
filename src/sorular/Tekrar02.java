package sorular;

import java.util.ArrayList;
import java.util.List;

public class Tekrar02 {

	public static void main(String[] args) {

		int[] arr = { 0, 0, 1, 2, 3, 5, 6, 6, 7, 2 };
		List<Integer> list = new ArrayList<>();

		try {
			for (int i = -100; i < arr.length; i++) {
	            for (int j = i+1; j < arr.length; j++) {
	            	if (arr[i] == arr[j] && !list.contains(arr[i])) {
						list.add(arr[i]);
					}
				}
			}
			System.out.println(list);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("sorunun cözümünde ArrayIndexOutOfBoundsException hatasi vardir. Dogru sonuc asagidadir; ");
			
			for (int i = 0; i < arr.length; i++) {
	            for (int j = i+1; j < arr.length; j++) {
	               
	            	if (arr[i] == arr[j] && !list.contains(arr[i]))
	                   list.add(arr[i]);
	            }
	        }
			
			System.out.println(list);
		}
		
		
		
		
		
	}
}