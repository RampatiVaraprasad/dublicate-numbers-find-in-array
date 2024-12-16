package ArraysPack;
class Number{
	int a[]= new int[] {2,4,6,8,10,12};
	int b[]= new int[] {2,4,6,9,10,12};
	int count = 0;
	public void shyam() {
		if(a.length==b.length) {

			for(int i=0;i<a.length;i++) {
				
					if(a[i]==b[i]) {
						count++;
					}
					System.out.println(a[i]+" "+b[i]);
			}
			if(count== a.length ) {
				System.out.println("Array is identical");
			}
			else
			{
				System.out.println("Array is not identical");
			}
		}

		else
			System.out.println("Array not identical");
	}

}
public class Iden {

	public static void main(String[] args) {
		Number n = new Number();
		n.shyam();
	}

}
