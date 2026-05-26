import java.util.Scanner;

class BankAccount{
    int accountNo;
    double balance;
    static String bankName;
    static double interestRate;

    public void getData(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account no.: ");
        this.accountNo = sc.nextInt();
        System.out.print("Enter balance: ");
        this.balance = sc.nextDouble();
        sc.nextLine();
        System.out.print("Enter bank name: ");
        bankName = sc.nextLine();
        System.out.print("Enter interest rate: ");
        interestRate = sc.nextDouble();
    }

    public void setData(){
        System.out.println();
        System.out.println("Account Details...");
        System.out.println("Account No: "+this.accountNo);
        System.out.println("Balance: "+this.balance);
        System.out.println("Bank name: "+bankName);
        System.out.println("Interest rate: "+interestRate);
    }

    public static void getStaticData(String bankName, double interestRate){
        bankName = bankName;
        interestRate = interestRate;
    }

    public static void setStaticData() {
        System.out.println("\nStatic Variables...");
        System.out.println("Bank name: " + bankName);
        System.out.println("Interest rate: " + interestRate);
    }
}

public class P3{
    public static void main(String []args){
        BankAccount.getStaticData("RNSB", 5.5);

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();
        BankAccount b3 = new BankAccount();

        b1.getData();
        b2.getData();
        b3.getData();

        b1.setData();
        b2.setData();
        b3.setData();

        BankAccount.setStaticData();
    }
}