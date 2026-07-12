abstract class Vehicle{
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle{
    public void startEngine(){
        System.out.println("Car's engine is started.");
    }

    public void stopEngine(){
        System.out.println("Car's engine is stopped.");
    }
}

class Motorcycle extends Vehicle{
    public void startEngine(){
        System.out.println("Motorcycle's engine is started.");
    }

    public void stopEngine(){
        System.out.println("Motorcycle's engine is stopped.");
    }
}

public class P3{
    public static void main(String []args){
        Car c = new Car();
        Motorcycle m = new Motorcycle();

        c.startEngine();
        c.stopEngine();

        m.startEngine();
        m.stopEngine();
    }
}