class Thread1 implements Runnable{
    public void run(){
        for(int i=1 ; i<=20 ; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
    }
}

class Thread2 implements Runnable{
    public void run(){
        for(int i=1 ; i<=20 ; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
    }
}

public class P3{
    public static void main(String []args){
        Thread1 t1 = new Thread1();
        Thread t2 = new Thread(t1);

        Thread2 t3 = new Thread2();
        Thread t4 = new Thread(t3);

        t2.start();
        t4.start();
    }
}