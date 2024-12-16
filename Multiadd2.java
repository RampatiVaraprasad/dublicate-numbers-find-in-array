package ArraysPack;
class Multiadditions{
	int [][] arr = {{1,3},{1,3}};
	int [][] brr = {{1,3},{1,3}};
	int r;
	int b;
	int [][] crr;

	public Multiadditions(int r, int b) {

		this.r= r;
		this.b=b;
		crr =new int [r][b];
	}
	public void data() {
		for(int i=0; i<r;i++) {
			for(int j=0; j<b;j++ ) {
				crr[i][j] =arr[i][j] + brr[i][j];
				System.out.print(crr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class Multiadd2 {

	public static void main(String[] args) {
		Multiadditions m = new Multiadditions(2,2);
		m.data();
	}
}
 