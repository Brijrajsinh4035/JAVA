
import java.util.Scanner;


public class AreaOfCircleStaticFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Circle Redius");
        double r = sc.nextDouble();
        CricleArea c1 = new CricleArea();
        System.out.println("Area of Circle "+c1.AreaOfCircle(r));
    }    
}
class CricleArea{
    static final double pi = 3.14159;

    double AreaOfCircle(double r){
        return pi*r*r;
    }
}
