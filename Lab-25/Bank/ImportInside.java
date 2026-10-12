package Bank;

public class ImportInside extends Account{
    public static void main(String[] args) {
        Account a1 = new Account();
        //a1.Display();
        System.out.println(a1.accNo);
        Account i1 = new ImportInside();
        System.out.println(i1.custName);
        //System.out.println(a1.balance);
        //System.out.println(a1.accType);

    }    
}
