class MyPoint{
    double x;
    double y;

    MyPoint(){
        this.x = 0;
        this.y = 0;
    }

    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint temp){
        return Math.sqrt(Math.pow((this.x - temp.x),2) + Math.pow((this.y - temp.y), 2));
    }

    public double distance(int x ,int y){
        return Math.sqrt(Math.pow((this.x-x), 2) + Math.pow(this.y-y, 2));
    }
}

class ThreeDpoint extends MyPoint{
    double z;

    ThreeDpoint(){
        this.z = 0;
    }

    ThreeDpoint(double x, double y, double z){
        super(x,y);
        this.z = z;
    }

    public double getZ(){
        return this.z;
    }

    public double distance(ThreeDpoint temp){
        return Math.sqrt(Math.pow((this.x - temp.x),2) + Math.pow((this.y - temp.y), 2) + Math.pow((this.z - temp.z), 2));
    }
}

public class P5{
    public static void main(String []args){
        ThreeDpoint d1 = new ThreeDpoint(14,14,4);
        ThreeDpoint d2 = new ThreeDpoint(7,7,2);

        System.out.println(d1.distance(d2));
    }
}