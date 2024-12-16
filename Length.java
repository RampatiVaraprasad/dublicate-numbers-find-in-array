package ArraysPack;
class Size{
	int a[]= new int[] {2,5,6,9,7,3,1};
	int count =0;
	public void cars() {
		for(int i=0; i<a.length;i++) {
			count++;
		}
		System.out.println(count);

	}
}
public class Length {

	public static void main(String[] args) {
		Size s = new Size();
		s.cars();
	}

}
