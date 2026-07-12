interface Transport{
    public void deliver();
}

abstract class Animal{
    public abstract void sound();
}

class Tiger extends Animal{
    public void sound(){
        System.out.println("Tiger sound");
    }
}

class Camel extends Animal implements Transport{
    public void deliver(){
        System.out.println("Camel delivers goods");
    }

    public void sound(){
        System.out.println("Camel sound");
    }
}

class Deer extends Animal{
    public void sound(){
        System.out.println("Deer sound");
    }
}

class Donkey extends Animal implements Transport{
    public void deliver(){
        System.out.println("Donkey delivers goods");
    }

    public void sound(){
        System.out.println("Donkey sound");
    }
}

public class P3{
    public static void main(String []args){
        Animal a[] = {
            new Tiger(),
            new Camel(),
            new Deer(),
            new Donkey()
        };

        for(int i=0 ; i<a.length ; i++){
            a[i].sound();

            if(a[i] instanceof Transport){
                ((Transport) a[i]).deliver();
            }
        }
    }
}