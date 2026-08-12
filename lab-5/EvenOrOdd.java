
import java.util.Scanner;

public class EvenOrOdd {
    public int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        EvenOrOdd e1 = new EvenOrOdd();
        e1.EvenOdd(n);
    }
    
    public void EvenOdd(int n)
    {
        if((n&2) == 0)
        {
            System.out.println("odd");
        }
        else
        {
            System.out.println("even");
        }
    }
}
