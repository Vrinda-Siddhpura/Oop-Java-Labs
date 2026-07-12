import java.util.Scanner;

public class P5{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter number: ");
            int n = sc.nextInt();

            if(n<10 || n>50){
                throw new Exception("Number is out of range!!");
            }
            else{
                int res = n*n;

                System.out.print("Result: "+res);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}