
import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Transcation t1 = new Transcation();
        t1.Account(sc);
        t1.TranscationStart(sc);
    }    
}

class Transcation{
    private double  bal;
    private int acc;

    void Account(Scanner sc){
        System.out.println("Enter Account");
        acc=sc.nextInt();
        System.out.println("Enter Balance");
        bal=sc.nextDouble();
    }

    void TranscationStart(Scanner sc)
    {
        while (true) { 
            System.out.println("Enter Transcation Process");
            System.out.println("1.Show Balance");
            System.out.println("2.Withdrow");
            System.out.println("3.Diposite");
            System.out.println("4.Exit");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Account = "+acc);
                    System.out.println("Balance = "+bal);
                    break;
                case 2:
                    double amout = sc.nextDouble();
                    if(bal < amout)
                    {
                        System.err.println("Invalid");
                    }
                    bal -= amout;
                    break;
                case 3:
                    amout = sc.nextDouble();
                    bal += amout;
                    break;
                case 4:
                    return;
                default:
                    continue;
            }
        }
    }
}
