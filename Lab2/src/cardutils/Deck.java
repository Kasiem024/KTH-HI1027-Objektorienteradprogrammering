package cardutils;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private static final ArrayList<Card> protoDeck = new ArrayList<>();

    static {
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                protoDeck.add(new Card(r, s));
            }
        }
    }

    private final ArrayList<Card> theCards;

    public Deck() {
        theCards = new ArrayList<>();
        fill();
    }

    public void fill() {
        theCards.clear(); // remove possibly remaining cards
        theCards.addAll(protoDeck);
    }

    public int getSize() {
        return theCards.size();
    }

    public Card dealCard() {
        return theCards.removeLast();
    }

    public void shuffle() {
        Collections.shuffle(theCards);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("[");
        if (!theCards.isEmpty()) {
            builder.append(theCards.getFirst().toShortString());
            for (int i = 1; i < theCards.size(); i++) {
                builder.append(", ").append(theCards.get(i).toShortString());
            }
        }
        builder.append("]");

        return builder.toString();
    }
}
