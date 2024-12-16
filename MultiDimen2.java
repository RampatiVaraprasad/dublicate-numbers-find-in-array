package ArraysPack;
class MultiArrays{
	int [][]arr =new int [2][2];
	public void show() {
		for(int i=0; i<2;i++) {
			for(int j=0;j<2;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
	}
}
public class MultiDimen2 {

	public static void main(String[] args) {
		MultiArrays  m = new MultiArrays();
		m.show();
	}

}
