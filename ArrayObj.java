package ArraysPack;
class Product{
	int rno;
	String name;
	public Product(int a, String s) {
		rno=a;
		name=s;

	}
	public void disp() {
		System.out.println("Roll no is:"+rno+" "+"Phone no is:"+name);
	}
}
public class ArrayObj {

	public static void main(String[] args) {
		Product[] p = new Product[3];
		p[0]=new Product(12,"Apple");
		p[1]=new Product(13,"Lemon");
		p[2]=new Product(14,"Orange");
		p[0].disp();
		p[1].disp();
		p[2].disp();
	}

}
