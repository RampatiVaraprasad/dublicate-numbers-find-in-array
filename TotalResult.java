package ArraysPack;

import java.util.Scanner;

public class TotalResult {
	
		
	
	int rollno[]=new int[4];
	public String sub[]=new String[] {"TELUGU     ","ENGLISH    ","HINDI      ","MATHEMATICS","SCIENCE    ","SOCIAL     "};

	public static final String ANSI_RESET_BG = "\u001B[0m";
	public static final String ANSI_BLACK_BG = "\u001B[40m";
	public static final String ANSI_YELLOW_BG = "\u001B[43m"; 
	public static final String ANSI_RED_BG = "\u001B[41m"; 
	public static final String ANSI_GREEN_BG= "\u001B[42m"; 
	public static final String ANSI_BLUE_BG= "\u001B[44m"; 
	public static final String ANSI_PURPLE_BG = "\u001B[45m"; 
	public static final String ANSI_CYAN_BG = "\u001B[46m";
	public static final String ANSI_WHITE_BG = "\u001B[47m";


	public static final String ANSI_BLACK= "\u001B[30m";
	public static final String ANSI_YELLOW = "\u001B[33m"; 
	public static final String ANSI_RED = "\u001B[31m"; 
	public static final String ANSI_GREEN= "\u001B[32m"; 
	public static final String ANSI_BLUE = "\u001B[34m"; 
	public static final String ANSI_PURPLE = "\u001B[35m"; 
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public void result1() {
		System.out.println(ANSI_YELLOW_BG+ANSI_RED+"           WELCOME TO STUDENT PORTAL           "+ANSI_RESET_BG);
		System.out.println(ANSI_GREEN+"HERE YOU CAN CHECK YOUR RESULTS"+ANSI_RESET_BG);
	}
	public void result(int[] S1,int[] S2,int[] S3,int [] S4) {

		Scanner sc=new Scanner(System.in);

		System.out.println(ANSI_GREEN_BG+ANSI_RED+"Enter hall ticket no"+ANSI_RESET_BG);

		while(true) {

			int studentNo=sc.nextInt();
			if(studentNo>=401 && studentNo<=404 )
			{
				System.out.println("------------------------------------");
				System.out.println(ANSI_YELLOW+"HALL TICKET NO:"+studentNo+ANSI_RESET_BG);
				System.out.println("------------------------------------");
				if (studentNo==401) {
					System.out.println(ANSI_YELLOW_BG+ANSI_GREEN+"SUBJECT"+ANSI_BLACK+"|"+"         "+"MARKS"+ANSI_BLACK+"|"+ "    "+" RESULT"+ANSI_BLACK+"   |"+ANSI_RESET_BG);
					System.out.println("------------------------------------");
					for(int i=0;i<S1.length;i++)
					{
						if(S1[i]>=35) {
							System.out.println(ANSI_GREEN+sub[i]+ANSI_BLACK+"|"+"          "+S1[i]+ANSI_BLACK+" |"+"   "+ANSI_GREEN_BG+"PASS"+ANSI_BLACK+" |"+ANSI_RESET_BG);
							System.out.println("------------------------------------");
						}
						else
						{
							System.out.println(ANSI_GREEN+sub[i]+ANSI_BLACK+"|"+"          "+ANSI_RESET_BG+S1[i]+ANSI_BLACK+" |"+"   "+ANSI_RED_BG+"FAIL"+ANSI_BLACK+" |"+ANSI_RESET_BG);
							System.out.println("------------------------------------");
						}
					}
					int sum=0;
					for(int i=0;i<S1.length;i++) {
						sum=sum+S1[i];

					}
					System.out.println(ANSI_GREEN_BG+"TOTAL MARKS :"+sum+ANSI_BLACK+"               |"+ANSI_RESET_BG);
					if(S1[0]>=35 && S1[1]>=35 && S1[2]>=35 && S1[3]>=35 && S1[4]>=35 &&S1[5]>=35 )
					{
						System.out.println(ANSI_GREEN_BG+"PASS"+ANSI_BLACK +"                  |"+ANSI_RESET_BG);
						System.out.println("------------------------------------");

					}
					else
					{
						System.out.println(ANSI_RED_BG+"FAIL"+ANSI_BLACK+"                    |"+ANSI_RESET_BG);
						System.out.println("------------------------------------");
					}
				}

				if (studentNo==402) {
					System.out.println(ANSI_YELLOW_BG+"SUBJECT"+ANSI_BLACK+"|"+"         "+"MARKS"+ANSI_BLACK+"|"+ "    "+ANSI_BLACK+"RESULT"+"|"+ANSI_RESET_BG);System.out.println(ANSI_YELLOW+"HALL TICKET NO:"+studentNo+ANSI_RESET_BG);
					System.out.println("------------------------------------");

					for(int i=0;i<S2.length;i++)
					{
						if(S2[i]>=35) {
							System.out.println(ANSI_GREEN+sub[i]+ANSI_BLACK+"|"+"          "+S2[i]+ANSI_BLACK+" |"+"   "+ANSI_GREEN_BG+"PASS"+ANSI_BLACK+" |"+ANSI_RESET_BG);
							System.out.println("------------------------------------");
						}
						else
						{
							System.out.println(ANSI_GREEN+sub[i]+ANSI_BLACK+"|"+"          "+ANSI_RESET_BG+S2[i]+ANSI_BLACK+" |"+"   "+ANSI_RED_BG+"FAIL"+ANSI_BLACK+" |"+ANSI_RESET_BG);
							System.out.println("------------------------------------");
						}
					}
					int sum=0;
					for(int i=0;i<S2.length;i++) {
						sum=sum+S2[i];

					}
					System.out.println(ANSI_GREEN_BG+"TOTAL MARKS :"+sum+"          |"+ANSI_RESET_BG);
					System.out.println("------------------------------------");
					if(S2[0]>=35 && S2[1]>=35 && S2[2]>=35 && S2[3]>=35 && S2[4]>=35 &&S2[5]>=35 )
					{
						System.out.println(ANSI_GREEN_BG+"PASS"+"         |"+ANSI_RESET_BG);
						System.out.println("------------------------------------");
					}
					else
					{
						System.out.println(ANSI_RED_BG+"FAIL"+"       |"+ANSI_RESET_BG);
						System.out.println("------------------------------------");
					}
				}
				if (studentNo==403) {
					System.out.println(ANSI_YELLOW_BG+"SUBJECT"+ANSI_BLACK+"|"+"         "+"MARKS"+ANSI_BLACK+"|"+ "    "+ANSI_BLACK+"RESULT"+"|"+ANSI_RESET_BG);
					System.out.println("------------------------------------");
					for(int i=0;i<S3.length;i++)
					{
						if(S3[i]>=35) {
							System.out.println(ANSI_GREEN+sub[i]+ANSI_BLACK+"       |"+"          "+S3[i]+ANSI_BLACK+" |"+"   "+ANSI_GREEN_BG+"PASS"+ANSI_BLACK+" |"+ANSI_RESET_BG);
							System.out.println("------------------------------------");
						}
						else
						{
							System.out.println(ANSI_GREEN+sub[i]+ANSI_BLACK+"|"+"          "+S3[i]+ANSI_BLACK+" |"+"   "+ANSI_GREEN_BG+"PASS"+ANSI_BLACK+" |"+ANSI_RESET_BG);
							System.out.println("------------------------------------");
						}
					}
					int sum=0;
					for(int i=0;i<S3.length;i++) {
						sum=sum+S3[i];

					}
					System.out.println(ANSI_GREEN_BG+"TOTAL MARKS :"+sum+"          |"+ANSI_RESET_BG);
					System.out.println("------------------------------------");
					if(S3[0]>=35 && S3[1]>=35 && S3[2]>=35 && S3[3]>=35 && S3[4]>=35 &&S3[5]>=35 )
					{
						System.out.println(ANSI_GREEN_BG+"PASS"+ANSI_BLACK+"           |"+ANSI_RESET_BG);
						System.out.println("------------------------------------");
					}
					else
					{
						System.out.println(ANSI_GREEN_BG+"FAIL"+ANSI_BLACK+"           |"+ANSI_RESET_BG);
						System.out.println("------------------------------------");
					}
				}
				if (studentNo==404) {
					System.out.println(ANSI_YELLOW_BG+"SUBJECT"+ANSI_BLACK+"|"+"         "+"MARKS"+ANSI_BLACK+"|"+ "    "+ANSI_BLACK+"RESULT"+"|"+ANSI_RESET_BG);
					for(int i=0;i<S4.length;i++)
					{
						if(S4[i]>=35) {
							System.out.println(ANSI_GREEN+sub[i]+ANSI_BLACK+"|"+"          "+S4[i]+ANSI_BLACK+" |"+ANSI_GREEN_BG+"   "+"PASS"+ANSI_BLACK+"   |"+ANSI_RESET_BG);
							System.out.println("------------------------------------");
						}
						else
						{
							System.out.println(ANSI_GREEN+sub[i]+ANSI_BLACK+"|"+ANSI_RED+"          "+S4[i]+ANSI_BLACK+" |"+"   "+ANSI_RED+"FAIL"+ANSI_BLACK+"  |"+ANSI_RESET_BG);
							System.out.println("------------------------------------");
						}
					}
					int sum=0;
					for(int i=0;i<S4.length;i++) {
						sum=sum+S4[i];

					}
					System.out.println(ANSI_GREEN_BG+"TOTAL MARKS :"+sum+ANSI_BLACK+"      |"+ANSI_RESET_BG);
					System.out.println("------------------------------------");
					if(S4[0]>=35 && S4[1]>=35 && S4[2]>=35 && S4[3]>=35 && S4[4]>=35 &&S4[5]>=35 )
					{
						System.out.println(ANSI_GREEN_BG+"PASS"+ANSI_BLACK+"            |"+ANSI_RESET_BG);
						System.out.println("------------------------------------");
					}
					else
					{
						System.out.println(ANSI_RED_BG+"FAIL"+ANSI_BLACK+"             |"+ANSI_RESET_BG);
						System.out.println("------------------------------------");
					}
				}
				this.result(S1, S2, S3, S4);

				break;
			}


			else{
				System.out.println(ANSI_RED+"enter valid number");
			}

		}
	}

}
	
