class A{
    public void greet(){
        System.out.println("Hello World!!");
    }
}

class B extends A{
    public void greet(){
        super.greet();
        System.out.println("Welcome to JAVA.");
    }
}

public class P3{
    public static void main(String []args){
        B b = new B();
        b.greet();
    }
}