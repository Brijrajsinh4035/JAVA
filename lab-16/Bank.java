public class Bank {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.deposit(500);
        s.withdrow(1000);
        CurrentAccount c = new CurrentAccount();
        c.deposit(1000);
        c.withdrow(1500);
    }
}

abstract class BankAccount {
    double amount;

    public abstract void deposit(double a);

    public abstract void withdrow(double a);
}

class SavingAccount extends BankAccount {

    public SavingAccount() {
        amount = 10000;
    }

    public void deposit(double a) {
        if (a > 0) {
            amount += a;
            System.out.println("Deposit amount =" + a);
            System.out.println("Saving Amount =" + amount);
        }
    }

    public void withdrow(double a) {
        if (amount > a) {
            amount -= a;
            System.out.println("Withdraw amount =" + a);
            System.out.println("Saving amount =" + amount);
        }

    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount() {
        amount = 20000;
    }

    public void deposit(double a) {
        if (a > 0) {
            amount += a;
            System.out.println("Current Amount =" + amount);
        }
    }

    public void withdrow(double a) {
        if (amount > a) {
            amount -= a;
            System.out.println("Withdraw amount =" + a);
            System.out.println("Current amount =" + amount);
        }
    }
}