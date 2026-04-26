import java.util.Scanner;

public class P4{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String s = sc.nextLine();
		int length = s.length();
		System.out.println("Total Length: "+length);	
		int l = length/2;
		String s2 = s.substring(l);
		System.out.print("Second Half: "+s2);
	}
}