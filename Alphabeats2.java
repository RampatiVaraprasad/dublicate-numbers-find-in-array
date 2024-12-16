package ArraysPack;

import java.util.Arrays;

class Conson{
	char ch []=new char[21];
	char ch1='a';
	public void jump() {
		for(int i=1; i<26;i++) {

			ch1++;
			if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u') {
				continue;

			}

			for(int j=0;j<ch.length;j++)
			{
				ch[j]=ch1;
				System.out.println(ch[j]);
				break;
			}
		}
	}
}
public class Alphabeats2 {


	public static void main(String[] args) {
		Conson c = new Conson();
		c.jump();
	}

}
