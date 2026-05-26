import java.util.Scanner;

class Area{
    static final double PI = 3.14159;

    public void area(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double area = PI*r*r;

        System.out.print("Area: "+area);
    }
}

public class P4{
    public static void main(String []args){
        Area a = new Area();
        a.area();
    }
}