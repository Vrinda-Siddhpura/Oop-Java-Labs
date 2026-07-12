class Thread1 implements Runnable{
    public void run(){
        try{
            while(true){
                System.out.println("Good Morning.");
                Thread.sleep(1000);
            }
        }
        catch(Exception e){}
    }
}

class Thread2 implements Runnable{
    public void run(){
        try{
            while(true){
                System.out.println("Good Afternoon.");
                Thread.sleep(3000);
            }
        }
        catch(Exception e){}
    }
}

public class P2{
    public static void main(String []args){
        Thread1 t1 = new Thread1();
        Thread t2 = new Thread(t1);

        Thread2 t3 = new Thread2();
        Thread t4 = new Thread(t3);

        t2.start();
        t4.start();
    }
}