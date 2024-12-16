package ArraysPack;

public class DuplicatenumbersinArray2 {

	public static void main(String[] args) {
		String[] arr = {"java", "python", "c", "c#", ".net", "Java"};
		for(int i=0; i<arr.length-1;i++){
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i] .equalsIgnoreCase(arr[j]) ) {
					System.out.println("duplicate num are : "+arr[j]);
				}
			}
		}
	}

}
