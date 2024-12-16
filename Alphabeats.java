package ArraysPack;
class Consonents{
	char ch[]= new char[] {'a','e','i','o','u'};

	public void jump() {
		for(int i=0; i<ch.length;i++) {

			System.out.println(ch[i]+" ");

		}
	}
}
public class Alphabeats {


	public static void main(String[] args) {
		Consonents c = new Consonents();
		c.jump();
	}

}
