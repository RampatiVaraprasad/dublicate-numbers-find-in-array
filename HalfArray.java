package ArraysPack;
class Half{
	int a[]= new int[] {5,10,2,6,9,12,14,16,18,50};
	int temp =0;
	public void rock() {
		for(int i=0;i<(a.length/2);i++) {
			for(int j=i+1;j<(a.length/2);j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
			System.out.println(a[i]);

		}
		for(int i=(a.length/2);i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}

	}
}

public class HalfArray {

	public static void main(String[] args) {
		Half h = new Half();
		h.rock();
	}

}
