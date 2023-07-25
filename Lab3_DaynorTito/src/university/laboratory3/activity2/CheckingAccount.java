package university.laboratory3.activity2;

public class CheckingAccount extends Account{
    public CheckingAccount(int initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

}
