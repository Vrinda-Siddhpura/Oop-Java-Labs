import java.util.Scanner;

public class P2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour: ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes: ");
        int min = sc.nextInt();

        double hourAngle = (hour*30) + min*0.5;
        double minAngle = min*6;

        double angle = Math.abs(hourAngle - minAngle);

        if(angle>180){
            angle = 360 - angle;
        }

        System.out.println("Angle: "+ angle);
    }
}
