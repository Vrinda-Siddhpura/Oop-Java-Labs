import java.util.Scanner;

public class P1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

		try{
			System.out.print("Enter number: ");
			int n = sc.nextInt();

			int result = 100/n;
			System.out.println("Result: "+result);
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by 0.");
		}

		int arr[] = {1, 2, 3};

		try{
			for(int i=0 ; i<=arr.length ; i++){
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bound.");
		}

		finally{
			System.out.println();
			System.out.println("Thank You!!");
		}
    }
}
