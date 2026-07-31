import java.util.*;

class BankAdd{
    private double Balance;
    public int AccountNo;
    
    BankAdd(double Balances,int ANo){
        Balance = Balances;
        AccountNo = ANo;
    }

    BankAdd(BankAdd B)
    {
        Balance = B.Balance;
        AccountNo = B.AccountNo;
    }

    public void BankProcess(Scanner sc)
    {
        while (true) {
            System.out.println("1. See Account Details");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Account No: "+AccountNo);
                    System.out.println("Balance: "+Balance);
                    break;
                case 2:
                    System.out.println("Enter Deposit Amount");
                    double D = sc.nextDouble();
                    Balance += D;
                    System.out.println("Total Balance: "+Balance);
                    break;    
                case 3:
                    System.out.println("Enter Amount For Withdraw");
                    double w = sc.nextDouble();
                    if(Balance-w < 10000)
                    {
                        System.out.println("Rs 10000 Minimum Balance is required Withdraw is Rejected");
                    }
                    else
                    {
                    Balance -= w;
                    System.out.println("Total Balance: "+Balance);
                    }
                    break;
                case 4:
                    return;
                
                default:
                    System.out.println("Enter Valid Process Number");
                    break;
            }
        }
    }
}

public class Bank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Account Number");
        int AccountNo = sc.nextInt();
        System.out.println("Enter Balances (Minimum 10,000)");
        double Balances = sc.nextDouble();
        if(Balances<10000)
        {
            System.out.println("Balance Should Minimum 10,000");
            System.exit(0);
        }
        BankAdd B1 = new BankAdd(Balances, AccountNo);
        BankAdd B2 = new BankAdd(B1);
        B1.BankProcess(sc);
        B2.BankProcess(sc);
    }    
}