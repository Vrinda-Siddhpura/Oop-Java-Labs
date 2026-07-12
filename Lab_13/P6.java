import java.util.Scanner;

class Thread1 implements Runnable{
    int row[];

    Thread1(int row[]){
        this.row = row;
    }

    public void run(){
        int sum = 0;

        for(int i=0 ; i<row.length ; i++){
            sum += row[i];
        }

        System.out.println("Row Sum = " + sum);
    }
}

public class P6{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size (m,n): ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter matrix elements: ");
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<m; i++){
            Thread1 t1 = new Thread1(arr[i]);
            Thread t2 = new Thread(t1);

            t2.start();
        }
    }
}