package ArraysPack;

public class MissingNumberInArray {
	// Array should not have duplicates
	// Array no need to be sorted
	// Values should be in range
	public static void main(String[] args) {
		int arr[] = {1,2,4,5};
		// 1+2+4+5+6 = 12  => sum1
		// 1+2+3+4+5 = 15  => sum2
		// sum2-sum1 = 15-12 => 3
		int sum1 = 0;
		for(int i=0; i<arr.length;i++) {
			sum1 = sum1+arr[i];
		}
		System.out.println("sum of all num is : "+sum1);
		int sum2 = 0;
		for(int i=1; i<=5; i++) {
			sum2 = sum2+i;
		}
		System.out.println("sum of range of array is : "+ sum2);
		System.out.println("Missing num is : "+(sum2-sum1));
	}
}
