package ArraysPack;
class Primenum{
	int a[]= new int [7];
	int count ;
	int num=7;
	public void show() {
		for(int i=0; i<7;i++) {
			if(a[num]%i==0) {
				count++;
			}

		}
		if(count==2) {
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}

	}
}
public class Prime {

	public static void main(String[] args) {
		Primenum p = new Primenum();
		p.show();
	}

}
