import java.util.Scanner;

public class P6{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int n = sc.nextInt();

		int temp = n;
		int res = 0;
		while(temp>0){
			int rem = temp%10;
			res = res*10 + rem;
			temp /= 10;
		}

		temp = n;
		if(temp==res){
			System.out.print("Palindrome Number");
		}
		else{
			System.out.print("Not Palindrome Number");
		}
	}
}