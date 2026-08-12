
import java.util.Scanner;

public class palindrom{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        palindrom p1 = new palindrom();
        p1.Ispalindrome(n);        
    }

    public void Ispalindrome(int n){
        int temp = n,rev = 0,rem = 0;
        while(n>0)
        {
            rem = n%10;
            rev = rem + (rev * 10);
            n = n / 10;
        }
        if(rev == temp)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
