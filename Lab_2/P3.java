import java.util.Scanner;

public class P3{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length: ");
		double l = sc.nextDouble();
		System.out.print("Enter Breadth: ");
		double b = sc.nextDouble();
		System.out.println("Area Of Rectangle: "+(l*b));
	}
}