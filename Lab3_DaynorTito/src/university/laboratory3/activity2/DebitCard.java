package university.laboratory3.activity2;

public class DebitCard extends Card{
    public DebitCard() {
    }

    @Override
    public void withdraw(int amount) {
        account.withdraw(amount);
    }
}
