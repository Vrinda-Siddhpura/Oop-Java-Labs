import java.util.Scanner;

public class P1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String: ");
		String s = sc.nextLine();
		int countV = 0;
		int countC = 0;
		for(int i=0 ; i<s.length() ; i++){
			char c = s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
				countV++;
			}
			else{
				countC++;
			}
		}
		System.out.println("Vowels: " + countV + " Consonants: " + countC);
	}
}
