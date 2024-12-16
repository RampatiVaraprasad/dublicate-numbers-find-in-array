package ArraysPack;

public class NestedArray {

	public static void main(String[] args) {
		int []arr= {0,1,0,1};
		for(int i=1;i<arr.length;i++) {
			System.out.println(arr[arr[i]]);

		}
	}

}
