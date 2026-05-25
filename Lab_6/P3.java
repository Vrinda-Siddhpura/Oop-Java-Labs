import java.util.Scanner;

class BankDemo{
	int accNum;
	String accType;
	double balance;

	public void getData(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Details...");
		System.out.print("Enter Account No: ");
		this.accNum = sc.nextInt();
		System.out.print("Enter Account Type: ");
		this.accType = sc.nextLine();
		sc.nextLine();
		System.out.print("Enter Balance: ");
		this.balance = sc.nextDouble();
	}

	public void setData(){
		System.out.println("Account Number: "+this.accNum);
		System.out.println("Account Type: "+this.accType);
		System.out.println("Balance: "+this.balance);
	}
}

public class P3{
	public static void main(String []args){

		BankDemo b1 = new BankDemo();
		BankDemo b2 = new BankDemo();
		BankDemo b3 = new BankDemo();

		b1.getData();
		b2.getData();
		b3.getData();

		System.out.println();
		System.out.println("Student1 Details...");
		b1.setData();
		System.out.println();
		System.out.println("Student2 Details...");
		b2.setData();
		System.out.println();
		System.out.println("Student3 Details...");
		b3.setData();
	}
}