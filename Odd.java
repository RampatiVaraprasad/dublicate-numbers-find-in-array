package ArraysPack;
class Oddnum{

	int a[]={1,2,5,6,3,2,7,10,9};

	public void soft() {
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				System.out.println(a[i]);
			}
		}
	}
}
public class Odd {

	public static void main(String[] args) {
		Oddnum o = new Oddnum();
		o.soft();
	}

}
