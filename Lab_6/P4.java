import java.util.*;

class A{
    int arr[] = {4, 2, 3, 5, 1};

    public void sortArray(){
        Arrays.sort(arr);
        
        System.out.println("Sorted Array:");
        for(int i=0 ; i<5 ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void searchArray(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number to found: ");
        int n = sc.nextInt();

        int found = 0;
        for(int i=0 ; i<5 ; i++){
            if(arr[i]==n){
                found = 1;
                break;
            }
        }

        if(found==1){
            System.out.println(n + " Found in array.");
        }
        else{
            System.out.println(n + " Not Found in array.");
        }
    }

    public void sumArray(){
        int sum = 0;

        for(int i=0 ; i<5 ; i++){
            sum += arr[i];
        }

        System.out.println("Sum: "+sum);
    }

    public void avgArray(){ 
        int sum = 0;

        for(int i=0 ; i<5 ; i++){
            sum += arr[i];
        }

        double avg = sum/5;
        System.out.println("Avg: "+avg);
    }
}

public class P4{
    public static void main(String []args){

        A a = new A();

        a.sortArray();
        a.searchArray();
        a.sumArray();
        a.avgArray();
    }
}