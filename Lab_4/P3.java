import java.util.Scanner;

public class P3{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Size Of An Array: ");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.print("Enter Elements: ");
		for(int i=0 ; i<size ; i++){
			arr[i] = sc.nextInt();
		}

		System.out.print("Reversed Order: ");
		int i=0;
		int j=size-1;
		while(i<j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		for(int k=0 ; k<size ; k++){
			System.out.print(arr[k] + " ");
		}
	}
}