import java.util.Scanner;

class House{
    private String address;
    private int numOfRooms;
    private double area;

    public void getData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter address: ");
        this.address = sc.nextLine();
        System.out.print("Enter number of rooms: ");
        this.numOfRooms = sc.nextInt();
        System.out.print("Enter area: ");
        this.area = sc.nextDouble();
    }

    public void setData(){
        System.out.println();
        System.out.println("House Details...");
        System.out.println("Address: "+this.address);
        System.out.println("Number of rooms: "+this.numOfRooms);
        System.out.println("Area: "+this.area);
        System.out.println();
    }

    public void calculatePrice(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price per square meter: ");
        double price = sc.nextDouble();

        double res = this.area*price;
        System.out.println("Price of the house: " + res + "$");
    }
}

public class P5{
    public static void main(String []args){
        House h = new House();

        h.getData();
        h.setData();
        h.calculatePrice();
    }
}