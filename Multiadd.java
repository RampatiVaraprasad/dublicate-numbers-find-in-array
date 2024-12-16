package ArraysPack;
class Multiaddition{
	int [][] arr;
	int [][] crr;
	int r;
	int c;
	public Multiaddition(int r, int c) {
		this.r= r;
		this.c=c;
		this.arr= new int [r][c];
		this.crr= new int [r][c];
		arr[0][0]=1;
		arr[0][1]=3;
		arr[1][0]=1;
		arr[1][1]=3;
		crr[0][0]=1;
		crr[0][1]=3;
		crr[1][0]=1;
		crr[1][1]=3;
	}
	public void data() {
		for(int i=0; i<r;i++) {
			for(int j=0; j<c;j++ ) {
				System.out.print((arr[i][j]+crr[i][j])+" ");
			}
			System.out.println();
		}
	}
}
public class Multiadd {

	public static void main(String[] args) {
		Multiaddition m = new Multiaddition(2,2);
		m.data();
	}

}
