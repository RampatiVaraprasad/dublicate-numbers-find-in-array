package ArraysPack;
class Taxes{

	int a[]= new int[] {8,14,2,21,39,22,74,65,92,27};
	int count=0;
	public void rocks() {
		for(int i=1; i<a.length;i++)
		{
			if(a[i]%10==2 )
			{
				count++;
			}
			if( a[i]/10==2) {
				count++;
			}
		}
		System.out.println(count);

	}
}
public class Govt2 {

	public static void main(String[] args) {
		Taxes t = new Taxes();
		t.rocks();
	}

}
