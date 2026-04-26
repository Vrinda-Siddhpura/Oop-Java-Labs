import java.util.Scanner;

public class P7{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1st Number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd Number: ");
		int b = sc.nextInt();

		for(int i=a ; i<=b ; i++){
			int count = 0;
			for(int j=1 ; j<=i ; j++){
				if(i%j==0){
					count++;
				}
			}
			if(count==2){
				System.out.println(i);
			}
		}
	}
}