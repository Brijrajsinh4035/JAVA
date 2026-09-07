public class BankStatic {
    public static void main(String[] args) {
        Bank b1 = new Bank(1234658, 500);
        Bank b2 = new Bank(1234659, 500);
        Bank b3 = new Bank(1234660, 500);
        Bank.setter("kotak",5.5);
        b1.getter();
        b2.getter();
        b3.getter();
    }
}

class Bank{
    private int accno;
    private double balance;
    static String bankname;
    static double rate;

    public Bank(int accno, double balance) {
        this.accno = accno;
        this.balance = balance;
    }

    public static void setter(String bankname,double rate){
        Bank.bankname = bankname;
        Bank.rate = rate;
    }

    public void getter(){
        System.out.println("Account No "+accno);
        System.out.println("Balance "+balance);
        System.out.println("Bank Name "+bankname);
        System.out.println("Rate "+rate);
    }
}
