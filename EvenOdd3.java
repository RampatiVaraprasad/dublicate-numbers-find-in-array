package ArraysPack;
class EvenandOdd{
	int a[]= new int[] {1,2,3,4,5,6,7,8,9,10,13,14,16};
	int count=0;
	int count1=0;
	public void show() {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}
	public void disp() {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==1) {
				count1++;
			}
		}
		System.out.println(count1);
	}
}

public class EvenOdd3 {

	public static void main(String[] args) {
		EvenandOdd a = new EvenandOdd();
		a.show();
		a.disp();
	}

}
