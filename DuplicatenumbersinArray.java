package ArraysPack;

public class DuplicatenumbersinArray {

	public static void main(String[] args) {
		String[] arr = {"java", "python", "c", "c#", ".net", "java"};
		for(int i=0; i<arr.length-1;i++){
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate num are : "+arr[j]);
				}
			}
		}
	}

}
