package ArraysPack;
class OddArray{
	int a[]= new int[] {1,2,3,4,5,6,7,8,9,10};
	int count=0;
	public void show() {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				count++;

			}

		}
		System.out.println(count);


	}
}
public class EvenOdd2 {

	public static void main(String[] args) {
		OddArray o = new OddArray();
		o.show();
	}

}
