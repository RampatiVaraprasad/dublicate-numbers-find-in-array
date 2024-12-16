package ArraysPack;

public class CountCharecterOccarence {

	public static void main(String[] args) {
		String s = "java full stack developer";
		int count =0;
		int totalcount = s.length(); // total length = 24
		int totalcount_AfterRemove = s.replace("e", "").length();// total length after removing e 
		for(int i=0; i<s.length();i++) {
			 count =  totalcount - totalcount_AfterRemove;
		}
		System.out.println("Number Occarence of e is :"+ count);
	}

}
