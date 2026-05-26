class Complex{
    int realNum;
    int imgNum;

    // Default Constructor
    Complex(){
        this.realNum = 0;
        this.imgNum = 0;
    }

    // Parameterized Constructor
    Complex(int realNum, int imgNum){
        this.realNum = realNum;
        this.imgNum = imgNum;
    }

    // Copy Contstructor
    Complex(Complex c){
        this.realNum = c.realNum;
        this.imgNum = c.imgNum;
    }

    public Complex addition(Complex c){
        Complex temp = new Complex();

        temp.realNum = this.realNum + c.realNum;
        temp.imgNum = this.imgNum + c.imgNum;

        return temp;
    }

    public void display(){
        System.out.print(this.realNum + " + " + this.imgNum + "i");
    }
}

public class P4{
    public static void main(String []args){
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, 4);

        Complex c3 = c1.addition(c2);

        System.out.print("First complex number: ");
        c1.display();
        System.out.println();

        System.out.print("Second complex number: ");
        c2.display();
        System.out.println();

        System.out.print("Addition: ");
        c3.display();
    }
}