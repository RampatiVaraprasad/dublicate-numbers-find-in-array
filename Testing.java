package ArraysPack;
class Data{
	int a[] = new int[] {12,13,14,15,16,17};
	public void show() {
		for(int i =0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("Enhanced for loop");
		for(int a1:a) {
			System.out.println(a1);
		}
	}
}
public class Testing {

	public static void main(String[] args) {
		Data d = new Data();
		d.show();
	}

}
