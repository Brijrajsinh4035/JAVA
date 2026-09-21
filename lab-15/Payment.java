import java.util.*;
public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentProcessing p1 = new PaymentProcessing();
        System.out.println("enter payment process type");
        String str = sc.next();
        str = str.toLowerCase();
        if(str.equals("upi")){
            p1 = new upi();
            p1.Display();
        }
        else if(str.equals("credit")){
            Credit d1 = new Credit();
            p1 = d1;
            p1.Display();
        }
        else if(str.equals("net")){
            p1 = new net();
            p1.Display();
        }
    }    
}

class PaymentProcessing{
    void Display(){
    }
}
class Credit extends PaymentProcessing {
    void Display(){
        System.out.println("credit");
    }
}
class upi extends PaymentProcessing{
    void Display(){
        System.out.println("upi");
    }
}
class net extends PaymentProcessing{
    void Display(){
        System.out.println("net banking");
    }
}


// class Process extends PaymentProcessing{
//     int amount;

//     public Process(int a) {
    //         amount = a;
    //     }
    
//     @Override
//     void CreditCard(){
//         System.out.println("Credit Card");
//         System.out.println("amount "+amount);
//     }
//     @Override
//     void Upi(){
//         System.out.println("UPI");
//         System.out.println("amount "+amount);
//     }
//     @Override
//     void NetBanking(){
//         System.out.println("Net Banking");
//         System.out.println("amount "+amount);
//     }
// }