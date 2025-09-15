package ps;

public enum PokerCombo {
    NONE(0),
    PAIR(1),
    TWO_PAIRS(3),
    THREE_OF_A_KIND(6),
    FLUSH(5),
    FULL_HOUSE(10),
    FOUR_OF_A_KIND(16),
    ROYAL_FLUSH(30);

    public int getComboPoints() {
        return points;
    }

    private final int points;

    PokerCombo(int points) {
        this.points = points;
    }
}