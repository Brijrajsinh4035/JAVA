
import java.util.Scanner;


public class BankDemo {
    int accNum;
    String accType;
    Double balance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankDemo b1 = new BankDemo();
        Bank bn1 = new Bank();
        b1.Intilation(sc,bn1);
        //b1.Intilation(sc);
        Bank bn2 = new Bank();
        // bn2.setter(accNum, accType, balance);
        b1.Intilation(sc,bn2);
        Bank bn3 = new Bank();
        b1.Intilation(sc,bn3);
        // bn3.setter(accNum, accType, balance);
        bn1.getter();
        bn2.getter();
        bn3.getter();
    }
    void Intilation(Scanner sc,Bank b){
        System.out.println("Enter Account No");
        accNum = sc.nextInt();
        System.out.println("Enter Account Type");
        accType = sc.next();
        System.out.println("Enter Account Balance ");
        balance = sc.nextDouble();
        b.setter(accNum, accType, balance);
    }
}

class Bank{
    int accNum;
    String accType;
    Double balance;

    void setter(int accNum,String accType,Double balance){
        this.accNum = accNum;
        this.accType = accType;
        this.balance = balance;
    }

    void getter(){
        System.out.println("ACCOUNT NUMBER "+accNum);
        System.out.println("ACCOUNT TYPE "+accType);
        System.out.println("ACCOUNT BALANCE "+balance);
    }
}