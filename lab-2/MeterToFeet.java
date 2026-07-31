import java.util.*;
public class MeterToFeet {
    public double ConvertToFeet(double n)
    {
        return n*3.28084;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        double n = sc.nextDouble();
        MeterToFeet m1 = new MeterToFeet();
        System.out.println("Feet = "+(m1.ConvertToFeet(n)));        
    }
}
