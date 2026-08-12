import java.util.Scanner;
public class MenuDriven { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MenuDriven m1 =new MenuDriven();
        m1.Area(sc);
    }
    void Area(Scanner sc){
        while (true) { 
            System.out.println("Enter Number");
            System.out.println("1 Circle Area");
            System.out.println("2 Rectangle Area");
            System.out.println("3 Triangle Area");
            System.out.println("4 Square Area");
            System.out.println("5 Exit");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter Redias");
                    double r = sc.nextDouble();
                    System.out.println("Circle Area " +(3.14*r*r));
                    break;
                case 2:
                    System.out.println("Enter Heigth");
                    double h = sc.nextDouble();
                    System.out.println("Enter Width");
                    double b = sc.nextDouble();
                    System.out.println("Reactangle Area "+(h*b));
                    break;
                case 3:
                    System.out.println("Enter Heigth");
                    h = sc.nextDouble();
                    System.out.println("Enter Base");
                    b = sc.nextDouble();
                    System.out.println("Triangle Area "+(0.5*b*h));
                    break;
                case 4:
                    System.out.println("Enter side");
                    h=sc.nextDouble();
                    System.out.println("Square Area "+(h*h));
                    break;
                case 5:
                    return;
                default:
                    continue;
            }
        }
    }
}
