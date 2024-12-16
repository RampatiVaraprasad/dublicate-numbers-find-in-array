package ArraysPack;
class Products{
	int rno;
	String name;
	public Products(int rno, String name) {
		this.rno=rno;
		this.name=name;

	}
	public void disp() {
		System.out.println("Roll no is:"+rno+" "+"Phone no is:"+name);
	}
}
public class ArrayObject {

	public static void main(String[] args) {
		Products[] p = new Products[3];
		p[0]=new Products(11,"Apple");
		p[1]=new Products(22,"Lemon");
		p[2]=new Products(33,"Orange");
		p[0].disp();
		p[1].disp();
		p[2].disp();
	}

}
