
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        AreaOfRectangle a1 = new AreaOfRectangle();
        Scanner sc = new Scanner(System.in);
        a1.RectangleArea(sc);
    }   

    // public static void main(String[] args) {
    //     AreaOfRectangle a1 = new AreaOfRectangle();
    //     Scanner sc = new Scanner(System.in);
    //     a1.RectangleArea(sc);
    // }
    
    void RectangleArea(Scanner sc)
    {
        System.out.println("Enter Height");
        double h = sc.nextDouble();
        System.out.println("Enter Width");
        double b = sc.nextDouble();
        System.out.println("Area Of Rectangle: "+(h*b));
    }
}
