abstract class BankAccount{
    public abstract void deposit();
    public abstract void withdraw();
}

class SavingsAccount extends BankAccount{
    public void deposit(){
        System.out.println("Cash deposited in savings account.");
    }

    public void withdraw(){
        System.out.println("Cash withdrawn from savings account.");
    }
}

class CurrentAccount extends BankAccount{
    public void deposit(){
        System.out.println("Cash deposited in current account.");
    }

    public void withdraw(){
        System.out.println("Cash withdrawn from current account.");
    }
}

public class P2{
    public static void main(String []args){
        SavingsAccount s = new SavingsAccount();
        CurrentAccount c = new CurrentAccount();

        s.deposit();
        s.withdraw();

        c.deposit();
        c.withdraw();
    }
}