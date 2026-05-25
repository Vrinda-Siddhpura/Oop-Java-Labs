import java.util.Scanner;

class Cube{
    double height;
    double width;
    double depth;

    public void getData(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Details...");
        System.out.print("Enter Height: ");
        this.height = sc.nextDouble();
        System.out.print("Enter Width: ");
        this.width = sc.nextDouble();
        System.out.print("Enter Depth: ");
        this.depth = sc.nextDouble();
    }

    public void setData(){
        System.out.println();
        System.out.println("Height: "+this.height);
        System.out.println("Width: "+this.width);
        System.out.println("Depth: "+this.depth);
    }

    public void volume(){
        double res = this.height*this.width*this.depth;

        System.out.print("Volume: "+res);
    }
}

public class P2{
    public static void main(String []args){

        Cube c1 = new Cube();
        Cube c2 = new Cube();

        c1.getData();
        c2.getData();

        System.out.println();
        System.out.println();
        System.out.print("Cube1 Details:");
        c1.setData();
        c1.volume();
        System.out.println();
        System.out.println();
        System.out.print("Cube2 Details:");
        c2.setData();
        c2.volume();
    }
}