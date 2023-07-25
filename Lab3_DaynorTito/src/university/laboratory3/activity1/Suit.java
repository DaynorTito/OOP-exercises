package university.laboratory3.activity1;

public enum Suit {
    TREBOL("T"),
    DIAMANTES("D"),
    CORAZONES("C"),
    ESPADAS("E");

    private String symbol;

    Suit(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}
