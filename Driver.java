package ArraysPack;

import java.lang.reflect.Array;

public class Driver {

	public static void main(String[] args) {
		int [] arry= {1,1,1,1,1,1,1,1,1,1};
		int a=0;
		for (int i=0;i<=arry.length-1;i++)
			a+=(arry[i]+arry[i]);
		// a= a+ arr[]
		// a=0+arr[]
		System.out.println(a);
			
}
}