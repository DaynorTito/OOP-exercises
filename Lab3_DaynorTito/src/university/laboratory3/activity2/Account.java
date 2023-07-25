package university.laboratory3.activity2;

public abstract class Account {
    protected int balance;

    public Account(int initialBalance) {
        this.balance = initialBalance;
    }
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public abstract boolean withdraw(int amount);

}
