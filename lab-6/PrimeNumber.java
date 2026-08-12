import java.util.Scanner;

public class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int n = sc.nextInt();
        PrimeNumber p1 = new PrimeNumber();
        int result = p1.prime(n);
        if(result == 0)
            System.out.println("Number is not prime");
        else
            System.out.println("Number is prime"); 
    }

    public int prime(int n)
    {
        if(n < 2)
            return 1; 
        for(int i = 2; i < n/2; i++)
        {
            if(n%i == 0)
                return 0;
        }
        return 1;
    }
}