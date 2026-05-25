import java.util.Scanner;

public class P7{
	public static int search(int arr[], int target){
		int i = 0;
		int j = arr.length-1;

		while(i<=j){
			int mid = (i+j)/2;

			if(arr[mid]==target){
				return mid;
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
				if(arr[mid]<target && target<=arr[j]) {
                    i = mid+1;
                } else {
                    j = mid-1;
                }
			}

		}

		return -1;
	}


	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		int arr1[] = {4,5,6,7,0,1,2};
		int target1 = 0;
		System.out.println("Index = " +search(arr1, target1));

		int arr2[] = {4,5,6,7,0,1,2};
		int target2 = 3;
		System.out.println("Index = " +search(arr2, target2));
	}
}