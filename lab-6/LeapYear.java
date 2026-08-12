
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year");
        int n = sc.nextInt();
        LeapYear l1 = new LeapYear();
        l1.Isleap(n);
    }

    public void Isleap(int n)
    {
        if((n % 400 == 0) || ((n % 4 == 0) && (n % 100 != 0)))
            System.out.println("leap Year");
        else
            System.out.println("not leap Year");
    }
}
