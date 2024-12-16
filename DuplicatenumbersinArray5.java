package ArraysPack;

import java.util.HashSet;

public class DuplicatenumbersinArray5 {

	public static void main(String[] args) {
		String[] arr = {"java", "python", "c", "c#", ".net", "jawa"};
		boolean flag = false;
		HashSet<String> hs = new HashSet();
		for(String h : arr) {
			if(hs.add(h)== false){
				System.out.println(" duplicate elements are : "+h);
				flag = true;
			}
		}
		if(flag == false) {
			System.out.println(" no duplicate element found ");

		}
	}
}
