import java.util.Scanner;

public class P3{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st Number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int b = sc.nextInt();
		System.out.print("Enter 3rd Number: ");
		int c = sc.nextInt();

		int res = Math.max(a, Math.max(b,c));
		System.out.print("Greatest: "+res);
	}
}