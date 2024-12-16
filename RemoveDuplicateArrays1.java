package ArraysPack;

public class RemoveDuplicateArrays1 {

	public static void main(String[] args) {
		String arr[]= {"Java","python", ".net", "devoops", "aws", "Java" };
		for(int i = 0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println("Duplicate element : "+ arr[i]);
				}
			}
		}
	}

}
