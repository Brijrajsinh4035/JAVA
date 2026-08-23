
import java.util.Scanner;

public class OddEvenWithBitwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OddEvenWithBitwise o1 = new OddEvenWithBitwise();
        int n = sc.nextInt();
        o1.main(n);
    }

    public static void main(int n) {
        if((n & 2) == 0)
        {
            System.out.println("Number is odd");
        }
        else
        {
            System.out.println("Number is even");
        }
    }
}
