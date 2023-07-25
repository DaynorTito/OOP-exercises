package university.laboratory3.activity2;

public class CreditCard extends Card{
    public CreditCard() {
    }

    @Override
    public void withdraw(int amount) {
        account.withdraw(amount);
    }
}
