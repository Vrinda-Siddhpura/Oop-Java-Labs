import java.util.Scanner;

public class P3{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int n = sc.nextInt();

        try{
            if(n<18){
                throw new Exception("Age is less than 18 is not allowed.");
            }
            else{
                System.out.print("Access granted.");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}