package ArraysPack;

public class ReverseString {

	public static void main(String[] args) {
		String str = "VARAPRASAD";
		String rev = " ";
		int len = str.length(); // 9

		for(int i=len-1; i>=0; i--) {
			rev = rev+str.charAt(i); // dasarparav
		}
		System.out.println("rev of string: "+rev.toLowerCase());
	}
}
