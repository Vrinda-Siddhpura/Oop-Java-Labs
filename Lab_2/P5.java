import java.util.Scanner;

public class P5{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Meter: ");
		double m = sc.nextDouble();
		System.out.println("Feet: "+(m*3.28084));
	}
}