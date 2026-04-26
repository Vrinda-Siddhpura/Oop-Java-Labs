import java.util.Scanner;

public class P1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Mark1: ");
		int a = sc.nextInt();
		System.out.print("Enter Mark2: ");
		int b = sc.nextInt();
		System.out.print("Enter Mark3: ");
		int c = sc.nextInt();
		System.out.print("Enter Mark4: ");
		int d = sc.nextInt();
		System.out.print("Enter Mark5: ");
		int e = sc.nextInt();

		double res = (a+b+c+d+e)/5;
		if(res>=60){
			System.out.print("First Class");
		}
		else if(res>=50 && res<=59){
			System.out.print("Second Class");
		}
		else if(res>=40 && res<=49){
			System.out.print("Third Class");
		}
		else{
			System.out.print("Fail");
		}
	}
}