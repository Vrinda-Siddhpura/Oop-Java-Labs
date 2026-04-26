import java.util.Scanner;

public class P2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int b = sc.nextInt();
		System.out.print("Enter Operation: ");
		char c = sc.next().charAt(0);
		switch(c){
			case '+':
				System.out.println(""+(a+b));
				break;
			case '-':
				System.out.println(""+(a-b));
				break;
			case '*':
				System.out.println(""+(a*b));
				break;
			case '/':
				System.out.println(""+(a/b));
				break; 
			default:
				System.out.println("Invalid Operation!");
		}
	}
}