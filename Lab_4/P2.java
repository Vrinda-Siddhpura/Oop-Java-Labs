import java.util.Scanner;

public class P2{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Size Of An Array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter Elements: ");
		for(int i=0 ; i<size ; i++){
			int value = sc.nextInt();
			arr[i] = value;
		}

		int sum = 0;
		for(int i=0 ; i<size ; i++){
			sum += arr[i];
		}

		double avg = sum / size;
		System.out.print("Avg: "+avg);
	}
}