
import java.util.*;
public class Armstrong
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");
        int n = sc.nextInt();
        A a1 = new A();
        a1.CountNumber(n); 
    }
}
class A{
    public void CountNumber(int n)
    {
        int count = 0,temp = n;
        while(n>0)
        {
            count++;
            n = n / 10;
        }
        IsArmstrong(count,temp);
    } 

    public void IsArmstrong(int count,int n)
    {
        int sum = 1,sum1 = 0,rem = 0,temp = n;
        while(n>0)
        {
            rem = n % 10;
            sum = 1;
            for(int i = 0; i < count; i++)
            {
                sum = sum*rem;
            }
            sum1=sum1+sum;
            n = n / 10;
        }
        //System.out.println("c=" +count);
        //System.out.println("sum=" +sum);
        if(temp == sum1)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
