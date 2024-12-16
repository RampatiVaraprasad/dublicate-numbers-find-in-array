package ArraysPack;
class Tax{

	int a[]= new int[] {8,14,2,21,39,22,74,65,92,27};

	public void rock() {
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%10==2 || a[i]/10==2) {
				System.out.println(a[i]);

			}
		}
	}
}
public class Govt {

	public static void main(String[] args) {
		Tax t = new Tax();
		t.rock();
	}

}
