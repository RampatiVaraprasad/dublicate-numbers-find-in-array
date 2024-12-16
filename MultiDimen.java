package ArraysPack;
class MultiArray{
	int [][]arr = {{1,2,7},{3,4,2},{5,6,9}};
	public void show() {
		for(int i=0; i<2;i++) {
			for(int j=0;j<3;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
	}
}
public class MultiDimen {

	public static void main(String[] args) {
		MultiArray  m = new MultiArray();
		m.show();
	}

}

