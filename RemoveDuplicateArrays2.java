package ArraysPack;

public class RemoveDuplicateArrays2 {

	public static void main(String[] args) {
		String arr[]= {"Java","python", ".net", "devoops", "aws", "Java" };
		boolean flag = true;
		for(int i = 0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].equalsIgnoreCase(arr[j])) {
					System.out.println("Duplicate element : "+ arr[i]);
					flag = false;
				}
			}
		}
		if(flag) {
			System.out.println("No Duplicates");
		}
	}

}
