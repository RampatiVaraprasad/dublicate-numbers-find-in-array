package ArraysPack;
class Numbers{
	int a[]= new int[] {2,4,6,8,10,12};
	int b[]= new int[] {2,4,6,8,9,12};
	//int count;

	public void shyam() {
		if(a.length==b.length) {

			for(int i=0;i<a.length;i++) {

				if(a[i]==b[i]) {
					//count++;
					if(i+1==a.length)
					{
						System.out.println("Array is identical");
					}
				}
				else {
					System.out.println("Array is not identical");
					break;
				}
			}
		}

		else
			System.out.println("Array length not identical");
	}

}
public class Iden2 {

	public static void main(String[] args) {
		Numbers n = new Numbers();
		n.shyam();
	}

}
