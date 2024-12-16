package ArraysPack;

import java.util.Arrays;

public class FindSecondLargestnum {
	public static void print2Largest(int arr[]) {
		int size = arr.length;//7
		if(size<2) {
			System.out.println("Invalid output");
			return;
		}
		Arrays.sort(arr);
		// 1,4,5,34,35,50,60
		System.out.println(arr[size-2]);
	}
	public static void main(String[] args) {
		int arr[] = {1,4,5,35,34,50,60};
		print2Largest(arr);
	}

}
