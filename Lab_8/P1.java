import java.util.Scanner;

class Time{
    int hour;
    int min;
    int sec;

    public void getData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour: ");
        this.hour = sc.nextInt();
        System.out.print("Enter minute: ");
        this.min = sc.nextInt();
        System.out.print("Enter second: ");
        this.sec = sc.nextInt();
    }

    public void addTime(Time t2){
        int totalSec = this.sec + t2.sec;
        int totalMin = this.min + t2.min + totalSec/60;
        int totalHour = this.hour + t2.hour + totalMin/60;   

        totalSec %= 60;
        totalMin %= 60;

        System.out.println();
        System.out.print("Total time: " + totalHour + ":" + totalMin + ":" + totalSec);
    }
}

public class P1{
    public static void main(String []args){
        Time t1 = new Time();
        Time t2 = new Time();

        System.out.println("Enter first time...");
        t1.getData();

        System.out.println("Enter second time...");
        t2.getData();

        t1.addTime(t2);
    }
}
