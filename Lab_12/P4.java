import java.util.Scanner;

public class P4{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter 1st number: ");
            String s1 = sc.nextLine();
            System.out.print("Enter 2nd number: ");
            String s2 = sc.nextLine();

            int n1 = Integer.parseInt(s1);
            int n2 = Integer.parseInt(s2);

            double res = n1/n2;
            System.out.print("Result: "+res);
        }
        catch(NumberFormatException e){
            System.out.println("Please enter a valid integer value!!!");
        }
        catch(ArithmeticException e){
            System.out.println("Cannot be divide by zero!!!");
        }
    }
}