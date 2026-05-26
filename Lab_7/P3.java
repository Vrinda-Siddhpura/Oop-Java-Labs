import java.util.Scanner;

public class P3{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int countV = 0;
        int countC = 0;
        while(true){
            System.out.print("Enter sentence: ");
            String s = sc.nextLine();

            if(s.equalsIgnoreCase("quit")){
                break;
            }

            s = s.toLowerCase();

            for(int i=0 ; i<s.length() ; i++){
                char c = s.charAt(i);
                if(c>='a' && c<='z'){
                    if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                        countV++;
                    }
                    else{
                        countC++;
                    }
                }
            }

            System.out.println("Vowles: "+countV);
            System.out.println("Consonant: "+countC);
        }
    }
}