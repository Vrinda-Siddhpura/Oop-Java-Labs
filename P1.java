abstract class Vegetable{
    String color;

    Vegetable(String color){
        this.color = color;
    }

    public abstract String toString();
}

class Potato extends Vegetable{
    Potato(){
        super("Brown");
    }

    public String toString(){
        return "Potato color is "+color;
    }
}

class Brinjal extends Vegetable{
    Brinjal(){
        super("Purple");
    }

    public String toString(){
        return "Brinjal color is "+color;
    }
}

class Tomato extends Vegetable{
    Tomato(){
        super("Red");
    }

    public String toString(){
        return "Tomato color is "+color;
    }
}

public class P1{
    public static void main(String []args){
        Potato p = new Potato();
        Brinjal b = new Brinjal();
        Tomato t = new Tomato();

        System.out.println(b);
        System.out.println(p);
        System.out.println(t);
    }
}