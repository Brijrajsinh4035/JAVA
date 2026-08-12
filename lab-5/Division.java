import java.util.Scanner;

public class Division {
    public int s1,s2,s3,s4,s5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Division d1 = new Division();
        d1.ObtainDivision(sc);
    }

    public void ObtainDivision(Scanner sc)
    {
        System.out.println("Enter Marks Of five Subject ");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        s4=sc.nextInt();
        s5=sc.nextInt();
        double per = ((s1+s2+s3+s4+s5)*100)/500;
        System.out.println("Percentage: "+per);
        if(per>=60)
        {
            System.out.println("First Division");
        }
        else if(per>=50 && per<=59){
            System.out.println("Second Division");
        }
        else if(per>=40 && per<=49){
            System.out.println("Third Division");
        }
        else{
            System.out.println("Fail");
        }
    }

}