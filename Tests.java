package ArraysPack;
class Test{
	int a[] = new int [] {12,13,14,15,16};           // Declaring array Literals

	public void disp () {
		for(int i=0; i<a.length-2;i++) {
			System.out.println(a[i]);

		}
	}
}
public class Tests {

	public static void main(String[] args) {
		Test t = new Test();
		t.disp();
	}

}
