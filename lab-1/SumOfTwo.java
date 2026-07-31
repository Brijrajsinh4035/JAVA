
import java.util.Scanner;

public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SumOfTwo s1 = new SumOfTwo();
        System.err.println("Enter two number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        s1.sum(a,b);
        System.err.println("with Scanner sum = "+(a+b));
        int c = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        System.out.println("With Command Line = "+(c+d));
    }

    void sum(int a,int b)
    {
        System.err.println("Sum with function = "+(a+b));
    }
}
