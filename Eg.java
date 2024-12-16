package ArraysPack;

public class Eg {

	public static void main(String[] args) {
		int []array = {1,1,1,1,1,1,1,1,1,1};
		int george = 0;
		int len=array.length-1;
		for(int i = 0 ; i<=len; i++) { //0 1 2 3 4 5 6 7 8 9

			george += (array[i]+array[i]);//georgge=geroge+array[i]+array[i];// 0+2 2+2 4+2 6+2 8+2 10+2 12+2 14+2 16+2 18+2
		
		System.out.print(george);
		}
		
	}

}
