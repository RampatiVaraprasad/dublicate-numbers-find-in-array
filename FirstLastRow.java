package ArraysPack;
class FirstLast{
	int a[][]= new int[][] {{1,2,3,4,5},{6,7,8,9,10},{1,2,3,4,5},{6,7,8,9,10}};
	public void disp() {
		for(int i=0;i<a.length;i=i+3) {
			for(int j=0; j<=a.length;j++) {
				System.out.print(a[i][j]); 
			}
			System.out.println();
		}
	}
}
public class FirstLastRow {

	public static void main(String[] args) {
		FirstLast f = new FirstLast();
		f.disp();
	}

}
