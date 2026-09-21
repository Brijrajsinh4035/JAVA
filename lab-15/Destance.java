public class Destance{
    public static void main(String[] args){
        ThreeDPoint p1 = new ThreeDPoint();
        ThreeDPoint p2 = new ThreeDPoint(10,30,25.5);
        p1.Distance(p2);
    }
}
class MyPoint{
    double x,y;
    MyPoint(){
        x=0;
        y=0;
    }   
    MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }
     double getX() {
        return x;
    }
    double getY() {
        return y;
    }
    void Distance(MyPoint p2){
        double d;
        double s1 = Math.pow(x-p2.x,2);
        double s2 = Math.pow(y-p2.y,2);
        d = Math.sqrt(s1+s2);
        System.out.println("Distance "+d);
    }
    void Distance(double x1,double y1){
        double d;
        d = Math.sqrt(Math.pow(x-x1, 2) + Math.pow(y-y1, 2));
        System.out.println("Distance "+d); 
    }
}

class ThreeDPoint extends MyPoint{
    double z;
    ThreeDPoint(){
        super();
        this.z=0;
    }
    ThreeDPoint(double x,double y,double z){
        super(x,y);
        this.z=z;
    }
    double getZ(){
        return z;
    }
    @Override
    void Distance(MyPoint p2){
        ThreeDPoint p = (ThreeDPoint) p2;
        double d;
        double s1 = Math.pow(x-p.x,2);
        double s2 = Math.pow(y-p.y,2);
        double s3 = Math.pow(z-p.z, 2);
        d = Math.sqrt(s1+s2+s3);
        System.out.println("Distance "+d);
    }
    
    void Distance(double x1,double y1,double z1){
        double d;
        d = Math.sqrt(Math.pow(x-x1, 2) + Math.pow(y-y1, 2)+Math.pow(z-z1, 2));
        System.out.println("Distance "+d); 
    }
}