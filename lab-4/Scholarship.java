import java.util.Scanner;

public class Scholarship{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        GetScholarship g1 = new GetScholarship();
        g1.IfGetScholarship(sc);
    }
}

class GetScholarship{
    private int s1,s2,s3,income;
    
    public void IfGetScholarship(Scanner sc)
    {
        System.out.println("Enter Marks of 1 subject");
        s1 = sc.nextInt();
        System.out.println("Enter Marks of 2 subject");
        s2 = sc.nextInt();
        System.out.println("Enter Marks of 3 subject");
        s3 = sc.nextInt();
        int sum = s1+s2+s3;
        double per = (sum*100)/300;
        System.out.println("Enter Annual Income");
        income = sc.nextInt();
        if(per >= 75 || income < 250000)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }
    }
}