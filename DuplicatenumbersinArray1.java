package ArraysPack;

public class DuplicatenumbersinArray1 {

	public static void main(String[] args) {
		String[] arr = {"java", "python", "c", "c#", ".net", "jawa"};
		boolean flag = false ;
		for(int i=0; i<arr.length-1;i++){
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("duplicate num are : "+arr[j]);
					flag = true;
				}
			}
		}
		if(flag == false) {
			System.out.println("no duplicate num are found ");
		}
	}
}
