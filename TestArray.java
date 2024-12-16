package ArraysPack;
class Match{
	int a[] = new int[] {12,13,14,15,16,17};
	public void arraydisp() {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);

		}
		for(int a1:a) {
			System.out.println(a1);
		}
	}
	public int[] returnArray() {
		return a;
	}
}

public class TestArray {

	public static void main(String[] args) {
		Match m = new Match();
		m.arraydisp();
		System.out.println("array values from main method");
		for(int aa : m.returnArray()) {
			System.out.println(aa);
		}
	}

}
