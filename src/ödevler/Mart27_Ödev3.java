package ödevler;

public class Mart27_Ödev3 {

	public static void main(String[] args) {
		/*
		Verilen String icerisindeki tekrar eden karakterleri yazdiran Java kodunu yaziniz. 
		String str=“ilovejavatoo” 
		Output: o v a
		         */
		
		String str="ilovejavatoo";
		
		for (int i = 0; i < str.length(); i++) {
					if (str.indexOf(str.substring(i, i+1))!=str.lastIndexOf(str.substring(i, i+1))) {
						System.out.print(str.substring(i,i+1));
				}
			
		}
		
		String str2="ilovejavatoo";
        String tekrar="";
        
        for (int i = 0; i < str2.length(); i++) {  
            for (int j = i+1; j < str2.length(); j++) {  
            	
            	if(str2.charAt(i)==str2.charAt(j) && tekrar.indexOf(str2.charAt(i))<0) {
            		tekrar+=str2.charAt(i);
                }
            }
        }
        System.out.println(tekrar);

	}

}
