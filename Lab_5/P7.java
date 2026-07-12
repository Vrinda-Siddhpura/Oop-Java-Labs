import java.util.Scanner;

public class P7{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		int arr[] = {4,5,6,7,0,1,2};
		int target = 0;

		int i=0;
		int j=arr.length-1;

		while(i<=j){
			int mid = (i+j)/2;

			if(target==arr[mid]){
				System.out.print("Index: "+mid);
				return;
			}

			if(arr[i]<=arr[mid]){
				if(arr[i]<=target && target<arr[mid]){
					j = mid-1;
				}
				else{
					i = mid+1;
				}
			}
			else{
				if(arr[mid]<target && target<=arr[j]){
					i = mid+1;
				}
				else{
					j = mid-1;
				}
			}
		}

		System.out.print("Index: -1");
	}
}
