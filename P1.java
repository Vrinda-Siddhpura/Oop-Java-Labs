import java.util.Scanner;

class Circle{
	double radius;

	public void getData(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		this.radius = sc.nextDouble();
	}

	public void area(){
		double res = 3.14*this.radius*this.radius;
		System.out.println("Area: " + res);
	}
}

public class P1{
	public static void main(String []args){
		Circle c = new Circle();

		c.getData();
		c.area();
	}
}