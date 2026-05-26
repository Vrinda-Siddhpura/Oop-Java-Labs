class A{
    static int count = 0;

    A(){
        count++;
    }

    static void displayCount(){
        System.out.println("Total Objects are "+count);
    }
}

public class P2{
    public static void main(String []args){
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();

        A.displayCount();
    }
}