package ArraysPack;
class Revers{
	int a[]=new int[] {2,4,6,8,18,12,14};

	public void disp() {
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
public class ReverseArray {
	public static void main(String[] args) {
		Revers r = new Revers();
		r.disp();
	}
}


