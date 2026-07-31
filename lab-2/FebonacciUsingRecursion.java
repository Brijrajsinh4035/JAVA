import java.util.Scanner;

public class FebonacciUsingRecursion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        FebonacciUsingRecursion f1 = new FebonacciUsingRecursion();
    //    f1.Fibo(n);        
        System.out.println("");
        f1.Fibo2(n, 0, 1);
    }

    // public void Fibo(int n)
    // {
    //     int a = 0,b = 1,c = 0,i = 1;
    //     while(i <= n)
    //     {
    //         System.out.print(a+" ");
    //         c = a + b;
    //         a = b;
    //         b = c;
    //         i++;
    //     }
    // }

    public int Fibo2(int n,int a,int b)
    {
        if(n<=0)
        {
            return -1; 
        }
        else
        {
            System.out.print(a+" ");
            int temp = b;
            b=a+b;
            a=temp;
            return Fibo2(--n, a, b);
        }
    }
}