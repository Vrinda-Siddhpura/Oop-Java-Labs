interface A{
    int a = 1;

    void methodA();
}
interface A1 extends A{
    int a1 = 2;

    void methodA1();
}

interface A2 extends A{
    int a2 = 3;

    void methodA2();
}

interface A12 extends A1, A2{
    int a12 = 4;

    void methodA12();
}

class B implements A12{
    public void methodA(){
        System.out.println("Constant A: "+a);
    }

    public void methodA1(){
        System.out.println("Constant A1: "+a1);
    }

    public void methodA2(){
        System.out.println("Constant A2: "+a2);
    }

    public void methodA12(){
        System.out.println("Constant A12: "+a12);
    }
}

public class P1{
    public static void main(String []args){
        B b = new B();

        b.methodA();
        b.methodA1();
        b.methodA2();
        b.methodA12();
    }
}
