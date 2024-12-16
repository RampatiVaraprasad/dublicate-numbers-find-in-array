package ArraysPack;
class Akkaiah{
	int h;
	private int rno=20;
	int c = 30;
	public int show() {

		return rno;
	}
	public int show(int a) {
		return h;
	}
}
class Ankarao extends Akkaiah{
	int a =10;
	public int show(int a) {

		return super.show(10);
		//	return c;

	}
}
public class varaprasad {

	public static void main(String[] args) {
		Ankarao ak = new Ankarao();
		System.out.println(ak.show());
	}

}
