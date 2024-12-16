package ArraysPack;
class MultipArrays{

	int r;
	int c;
	int [][] arr;
	int a=1;
	public MultipArrays(int r, int c) {

		this.r=r;
		this.c=c;
		arr = new int [r][c];

	}

	public void shows() {
		for(int i=0; i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=a;
				System.out.print(arr[i][j] +" ");
				a++;
			}
			System.out.println();

		}
	}
}
public class MultiDimen3 {

	public static void main(String[] args) {
		MultipArrays  m = new MultipArrays(4,4);
		m.shows();
	}

}

