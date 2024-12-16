package ArraysPack;
class SumArray{
	int a[]= new int[] {10,20,30,40,50};
	int sum;

	public void gost() {
		for(int i=0;i<a.length;i++) {
			sum=sum +a[i];
		}
		System.out.println(sum);


	}
}
public class Sum {

	public static void main(String[] args) {
		SumArray s = new SumArray();
		s.gost();
	}

}
