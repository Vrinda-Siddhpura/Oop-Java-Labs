class Producer extends Thread{
    public void run(){
        for(int i=1 ; i<=5 ; i++){
            System.out.println("Produced: " + i);
            try{
                Thread.sleep(500);
            } catch(Exception e){}
        }
    }
}

class Consumer extends Thread{
    public void run(){
        for(int i=1 ; i<=5 ; i++){
            System.out.println("Consumed: " + i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){}
        }
    }
}

public class P4{
    public static void main(String[] args){
        Producer p = new Producer();
        Consumer c = new Consumer();

        p.start();
        c.start();
    }
}