
import java.util.Scanner;

public class MaxFromThree {
    static int a,b,c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxFromThree m1 = new MaxFromThree(sc);
        m1.max(a, b, c);
    }

    public MaxFromThree(Scanner sc) {
        System.out.println("Enter Three Number");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt(); 
    }
    
    public void max(int a,int b,int c)
    {
        int max = a>b && a>c ? a : b>c ? b :c ;
        System.out.println("max = "+max);
    }
    
}
