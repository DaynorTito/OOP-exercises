package university.laboratory3.activity1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    @Test
    public void verifyWinner(){
        Deck deck = new Deck();
        Card computer = deck.drawCard();
        Card playerCard = deck.drawCard();
        String answer;
        if (computer.getValue() > playerCard.getValue())
            answer = "You lost";
        else if (computer.getValue() < playerCard.getValue())
            answer = "You win";
        else
            answer = "Tie";

        assertEquals(answer,deck.compare(computer,playerCard),"the winner is incorrect");
    }
}