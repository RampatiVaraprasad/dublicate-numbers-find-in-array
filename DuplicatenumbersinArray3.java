package ArraysPack;

import java.util.HashSet;

public class DuplicatenumbersinArray3 {

	public static void main(String[] args) {
		String[] arr = {"java", "python", "c", "c#", ".net", "java"};
		HashSet<String> hs = new HashSet();
		
		for(String h : arr) {
			if(hs.add(h)== false){
				System.out.println(" duplicate elements are : "+h);
			}
		}
	}

}
