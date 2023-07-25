package university.laboratory3.activity2;

public abstract class Card {
    protected Account account;


    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public abstract void withdraw(int amount);
}
