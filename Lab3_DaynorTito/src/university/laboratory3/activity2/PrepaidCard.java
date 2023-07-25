package university.laboratory3.activity2;

public class PrepaidCard extends Card{
    public PrepaidCard() {
    }

    @Override
    public void withdraw(int amount) {
        account.withdraw(amount);
    }
}
