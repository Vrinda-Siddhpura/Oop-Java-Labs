import java.util.Scanner;

class Area{
	double radius;

	public double area(){
		return Math.PI*radius*radius;
	}
}

public class P1{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);

		Area a = new Area();
		a.radius = 2;
		System.out.print("Area: "+ a.area());
	}
}