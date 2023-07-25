package university.laboratory3.activity1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
        shuffleDeck();
    }

    public Deck(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    private void initializeDeck() {
        for (Suit suit : Suit.values()) {
            for (int value = 2; value <= 14; value++) {
                cards.add(new Card(suit, value));
            }
        }
    }

    private void shuffleDeck() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null;
    }

    public String compare(Card cardComputer, Card cardPlayer){
        if (cardComputer.getValue() > cardPlayer.getValue())
            return "You lost";
        else if (cardComputer.getValue() < cardPlayer.getValue())
            return "You win";
        else
            return "Tie";
    }
}
