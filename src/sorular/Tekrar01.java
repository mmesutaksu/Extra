package sorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tekrar01 {

	public static void main(String[] args) {
		
		// verilen arrayList'teki karakterlerin tekrar edenlerini yazdiriniz
				
		int[] arr = { 0, 0, 1, 2, 3, 5, 6, 6, 7, 2, 6, 4};
		List<Integer> list=new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
               
            	if (arr[i] == arr[j] && !list.contains(arr[i]))
                   list.add(arr[i]);
            }
        }
		for (int i = 0; i < list.size(); i++) { // 0 2 6 
			System.out.print(list.get(i)+" ");
		}
		
		System.out.println();
		
		// cevabimizi list ile yazdiriyoruz
		System.out.println(list);  // [0, 2, 6]
			
		// sonucumuz olan list'i array'a cevirerek cevabi yazdiriyoruz
		Integer arr3[]=list.toArray(new Integer [list.size()]);
		
		System.out.println(Arrays.toString(arr3));  // [0, 2, 6]
		
		// sonucumuz olan list'i for döngüsüyle array'a cevirerek cevabi yazdiriyoruz
		int[] arr2=new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr2[i]=list.get(i);
		}
		
		System.out.println(Arrays.toString(arr2));  // [0, 2, 6]
		
		
		
		
    }
}
