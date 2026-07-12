class MyThread implements Runnable{
    public void run(){
        System.out.println("Thread is Running");
    }
}

public class P1ii{
    public static void main(String []args){
        MyThread t = new MyThread();
        Thread t1 = new Thread(t);
        t1.start();
    }
}