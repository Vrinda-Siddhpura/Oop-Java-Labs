import java.util.Scanner;

public class P6{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Letter: ");
		Character a = sc.next().charAt(0);
		if((a>='a' && a<='z') || (a>='A' && a<='Z')){
			if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u' || a=='A' || a=='I' || a=='O' || a=='U'){
				System.out.println("Vowels");
			}
			else{
				System.out.println("Consonant");
			}
		}
		else{
			System.out.println("Constant");
		}
	}
}