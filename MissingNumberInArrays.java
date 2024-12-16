package ArraysPack;

public class MissingNumberInArrays {

	public static void main(String[] args) {
		int arr[] = {1,2,4,6,8,9,10}; // length = 6
		for(int j=1; j<=10; j++) { //2,3,4,5
			int count =0;
				for(int i=0; i<=arr.length-1;i++) { //1,2,3,4
				if(i<arr.length-1) { // 
					if(arr[i]==j) {  //length = 6-1=5
						count++;  //1,2,3,4
					}
				} else{
					if(arr[i]==j||count>0) {
					} else {
						System.out.print(j+" ");
					}
				}
			}
		}
	}
}
