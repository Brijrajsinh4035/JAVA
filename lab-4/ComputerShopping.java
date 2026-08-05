
import java.util.Scanner;

public class ComputerShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenrate b1 = new BillGenrate();
        System.out.println("Payable Amount: "+b1.Bill(sc));
    }
}
class BillGenrate{
    private double  amount,PayAmount;

    public double  Bill(Scanner sc)
    {
        System.out.println("Enter Bill Amount");
        amount = sc.nextDouble();
        if(amount >= 5000)
        {
            PayAmount = amount * 0.80;
            PayAmount = PayAmount * 1.05;
        }
        else if(amount >= 3000)
        {
            PayAmount = amount * 0.90;
            PayAmount = PayAmount * 1.05;
        }
        return  PayAmount;
    }
}