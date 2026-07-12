import java.util.Random;

class Thread1 implements Runnable{
    public void run(){
        Random r = new Random();

        try{
            while(true){
                int n = r.nextInt(100);
                System.out.println("Generated Number: "+n);

                if(n%2==0){
                    new Thread(new Thread2(n)).start();
                }
                else{
                    new Thread(new Thread3(n)).start();
                }

                Thread.sleep(1000);
            }
        }
        catch(Exception e){}
    }
}

class Thread2 implements Runnable{
    int n;

    Thread2(int n){
        this.n = n;
    }

    public void run(){
        System.out.println("Square of " + n + " : " + (n*n));
    }
}

class Thread3 implements Runnable{
    int n;

    Thread3(int n){
        this.n = n;
    }

    public void run(){
        System.out.println("Cube of " + n + " : " + (n*n*n));
    }
}

public class P5{
    public static void main(String []args){
        Thread1 t1 = new Thread1();
        Thread t2 = new Thread(t1);

        t2.start();
    }
}