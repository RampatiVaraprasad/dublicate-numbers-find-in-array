package ArraysPack;
class ArrayAsObject{
	int empid;
	int empsalary;
	String empname;
	public ArrayAsObject(int id,int salary, String name) {
		this.empid= id;
		this.empsalary= salary;
		this.empname= name;
	}
	public void disp() {
		System.out.println("empid is :"+empid+" "+"empsalary is :"+empsalary+" "+"empname is:"+empname+" ");	
	}
}
public class ArrayObjects {

	public static void main(String[] args) {
		ArrayAsObject[] a = new ArrayAsObject[10];
		a[0]= new ArrayAsObject(1,1000,"ram");
		a[1]= new ArrayAsObject(2,2000,"sam");
		a[2]= new ArrayAsObject(3,3000,"bam");
		a[3]= new ArrayAsObject(4,4000,"kam");
		a[4]= new ArrayAsObject(5,5000,"pam");
		a[5]= new ArrayAsObject(6,6000,"tam");
		a[6]= new ArrayAsObject(7,7000,"dam");
		a[7]= new ArrayAsObject(8,8000,"lam");
		a[8]= new ArrayAsObject(9,9000,"ham");
		a[9]= new ArrayAsObject(10,10000,"mam");

		a[0].disp();
		a[1].disp();
		a[2].disp();
		a[3].disp();
		a[4].disp();
		a[5].disp();
		a[6].disp();
		a[7].disp();
		a[8].disp();
		a[9].disp();
	}
}
