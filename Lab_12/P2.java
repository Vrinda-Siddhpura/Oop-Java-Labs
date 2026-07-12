import java.util.Scanner;

class InSufficientFundException extends Exception{
    InSufficientFundException(String msg){
        super(msg);
    }
}

class Account{
    int accNo;
    double balance;

    Account(int accNo, double balance){
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();

        balance += amount;
        System.out.print("Balance: "+balance);
    }

    public void withdraw(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        try{
            if(amount<=0 || amount>balance){
                throw new InSufficientFundException("Invalid Amount!!");
            }
            else{
                balance -= amount;
                System.out.print("Balance: "+balance);
            }
        }
        catch(Exception e){
            System.out.print(e.getMessage());
        }
    }
}

public class P2{
    public static void main(String[] args){
        Account a = new Account(101, 10000);
        a.deposit();
        a.withdraw();
    }
}