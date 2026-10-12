package Bank;

public class Account {
    public  int accNo=101;
    protected String custName="raj";
    private double balance=500.50;
    String accType="saving";

    public void Display(){
        System.out.println(accNo);
        System.out.println(custName);
        System.out.println(balance);
        System.out.println(accType);
    }
}
