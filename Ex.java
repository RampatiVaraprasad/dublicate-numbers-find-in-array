package ArraysPack;

public class Ex {

	public static void main(String[] args) {
		int num[]= {2,3,4,5};
		Ex.numbers(num);
	}
	public static void numbers(int[] num) {
		for(int x = 1; x<num.length;x++) {// 1<4 2<4 3<4 4<4
			num[x] = num[3];// num[1]=5 num[2]=5 num[3]=5
		}
		for(int x=0;x<num.length;x++) {// 0<4 1<4 2<4 3<4 4<4
			System.out.println(num[x]);// 2 5 5 5
		}
	}

}
