public class Bank{
    public static void main(String[] args){
        Account a1 = new SavingAccount("raj","123");
        a1.details();
        Account l1 = new LoanAccount("meet","123456","789");
        l1.details();
    }
}
class Account{
    String name,accno;

    Account(String name,String accno){
        this.name=name;
        this.accno=accno;
    }

    void details(){
        
    }
}
class SavingAccount extends Account{
    
    SavingAccount(String name,String accno){
        super(name,accno);
    }

    void details(){
        System.out.println("name "+name);
        System.out.println("accno "+accno);
    }
}
class LoanAccount extends SavingAccount{
    String lonno;
    LoanAccount(String name,String accno,String lonno){
        super(name,accno);
        this.lonno = lonno;
    }
    @Override
    void details(){
        System.out.println("name "+name);
        System.out.println("accno "+accno);
        System.out.println("lonno "+lonno);
    }

}