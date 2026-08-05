
import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CreateBill c1 = new CreateBill();
        System.err.println("Bill Amount: "+c1.bill(sc));
    }    
}

class CreateBill{
    private double amount;
    public double bill(Scanner sc)
    {
        System.out.println("Enter Units");
        int u = sc.nextInt();
        if(u <= 100)
        {
            amount = u * 5;
        }
        else if(u <= 200)
        {
            amount = (100*5) + (u - 100) * 7;
        }
        else
        {
            amount = (100*5) + (100*7) + (u-200) * 10; 
        }
        return amount;
    }
}