package ArraysPack;
class Reverse{
	int a[]= new int[] {12,56,3,9,74,66,55};
	int temp;
	public void shows() {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {	
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
			System.out.println(a[i]);
		}
	}
}
public class ArrayReverse {

	public static void main(String[] args) {
		Reverse r = new Reverse();
		r.shows();

	}

}
