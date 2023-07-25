package university.laboratory3.activity2;

public class TemporaryAccount extends Account{
    public TemporaryAccount(int initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            if (balance == 0) {
                System.out.println("The account is disabled.");
            }
            return true;
        }
        System.out.println("Insufficient funds in the account.");
        return false;
    }
}
