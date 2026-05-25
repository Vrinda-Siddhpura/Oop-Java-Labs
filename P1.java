import java.util.Scanner;

class Student{
	String name;
	int roll_no;
	double spi;
	String course;

	public void getData(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Name: ");
		this.name = sc.next();
		System.out.print("Enter Roll_no: ");
		this.roll_no = sc.nextInt();
		System.out.print("Enter Spi: ");
		this.spi = sc.nextDouble();
		System.out.print("Enter Course: ");
		this.course = sc.next();
	}

	public void setData(){
		System.out.println();
		System.out.println("Name: "+this.name);
		System.out.println("Roll_no: "+this.roll_no);
		System.out.println("Spi: "+this.spi);
		System.out.println("Course: "+this.course);
	}
}

public class P1{
	public static void main(String []args){
		Student s1 = new Student();
		s1.getData();

		Student s2 = new Student();
		s2.getData();

		Student s3 = new Student();
		s3.getData();

		s1.setData();
		s2.setData();
		s3.setData();
	}
}

