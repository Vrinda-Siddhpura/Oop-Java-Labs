class Employee{
    public void work(){
        System.out.println("Employee is working.");
    }

    public void getSalary(){
        System.out.println("Salary is 50000$.");
    }
}

class HRManager extends Employee{
    public void work(){
        System.out.println("HR manager is managing employees.");
    }

    public void addEmployee(){
        System.out.println("New employee added.");
    }
}

public class P2{
    public static void main(String []args){
        HRManager m1 = new HRManager();

        m1.work();
        m1.getSalary();
        m1.addEmployee();
    }
}