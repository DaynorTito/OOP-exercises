package university.laboratory3.activity1;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Card computer = deck.drawCard();
        Card playerCard = deck.drawCard();

        System.out.println("Card Computer: " + computer.getSuit().getSymbol() + computer.getValue());
        System.out.println("Card Player: " + playerCard.getSuit().getSymbol() + playerCard.getValue());

        System.out.println("\n"+deck.compare(computer,playerCard));

        Card computer2 = deck.drawCard();
        Card playerCard2 = deck.drawCard();

        System.out.println("Card Computer: " + computer2.getSuit().getSymbol() + computer2.getValue());
        System.out.println("Card Player: " + playerCard2.getSuit().getSymbol() + playerCard2.getValue());

        System.out.println("\n"+deck.compare(computer,playerCard));

        Card computer3 = deck.drawCard();
        Card playerCard3 = deck.drawCard();

        System.out.println("Card Computer: " + computer3.getSuit().getSymbol() + computer3.getValue());
        System.out.println("Card Player: " + playerCard3.getSuit().getSymbol() + playerCard3.getValue());

        System.out.println("\n"+deck.compare(computer3,playerCard3));
    }
}