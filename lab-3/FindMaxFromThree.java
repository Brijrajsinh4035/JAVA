
import java.util.Scanner;

public class FindMaxFromThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindMaxFromThree f1 = new FindMaxFromThree();
        System.out.println("Enter Three Number ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Max = "+f1.FindMax(a, b, c));
    }

    public int FindMax(int a,int b,int c)
    {
        return a > b && a > c ? a : b > c ? b : c; 
    }
}
