package university.laboratory3.activity2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    public void testWithdrawals(){
        Account c1 = new CheckingAccount(500);
        Card t1 = new CreditCard();
        t1.setAccount(c1);
        t1.withdraw(50);

        Account c2 = new CheckingAccount(100);
        Card t2 = new CreditCard();
        t2.setAccount(c2);
        t2.withdraw(50);

        Card t3 = new PrepaidCard();
        Account c3 = new TemporaryAccount(100);
        t3.setAccount(c3);
        t3.withdraw(100);

        Card t4 = new DebitCard();
        Account c4 = new CheckingAccount(200);
        t4.setAccount(c4);
        t4.withdraw(30);

        assertEquals(450,c1.getBalance(),"balance does not match");
        assertEquals(50,c2.getBalance(),"balance does not match");
        assertEquals(0,c3.getBalance(),"balance does not match");
        assertEquals(170,c4.getBalance(),"balance does not match");
    }

}