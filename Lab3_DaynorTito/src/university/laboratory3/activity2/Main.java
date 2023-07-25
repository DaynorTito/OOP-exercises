package university.laboratory3.activity2;

public class Main {
    public static void main(String[] args) {
        Account c1 = new CheckingAccount(500);
        Card t1 = new CreditCard();
        t1.setAccount(c1);
        t1.withdraw(50);
        System.out.println("Account c1 balance: " + c1.getBalance()+"\n");

        Account c2 = new CheckingAccount(100);
        Card t2 = new CreditCard();
        t2.setAccount(c2);
        t2.withdraw(50);
        System.out.println("Card t2 balance: " + c2.getBalance()+"\n");

        Card t3 = new PrepaidCard();
        Account c3 = new TemporaryAccount(100);
        t3.setAccount(c3);
        t3.withdraw(100);
        System.out.println("Card t3 balance: " + c3.getBalance()+"\n");

        Card t4 = new DebitCard();
        Account c4 = new CheckingAccount(200);
        t4.setAccount(c4);
        t4.withdraw(30);
        System.out.println("Card t4 balance: " + c4.getBalance()+"\n");
    }
}
