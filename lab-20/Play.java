
public class Play {
    public static void main(String[] args) throws InSufficientFundException {
        Account a1 = new Account(10000);
        a1.deposit(1500);
        a1.withdraw(16000); 
    }
}

class InSufficientFundException extends Exception{
    public InSufficientFundException(String msg){
        super(msg);
    }
}

class Account{
    double amount;

    public Account(double amount) {
        this.amount = amount;
    }
    
    void deposit(double amount){
        this.amount += amount;
    }

    void withdraw(double amount)throws InSufficientFundException {
        if(this.amount-amount<1000){
            throw new InSufficientFundException("minimum 1000 balance require");
        }
        this.amount -= amount;
    }
}