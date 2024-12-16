package ArraysPack;
class ArrayRet{
	int sum;
	public int Sunny(int a[]) {
		for(int i=0; i<a.length;i++) {
			sum = sum+a[i];

		}
		System.out.println(sum);
		return sum;



	}
}
public class ReturnArray {

	public static void main(String[] args) {
		int a[]= {2,4,6,8,10,12,14};
		ArrayRet ar = new ArrayRet();
		ar.Sunny(a);

	}

}
