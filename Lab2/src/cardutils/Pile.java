package cardutils;

import java.util.ArrayList;

/**
 * Represents a pile of cards, e.g. a hand in a card game.
 */
public class Pile {

    private final ArrayList<Card> theCards;

    public Pile() {
        this.theCards = new ArrayList<>();
    }

    public Pile(ArrayList<Card> initialCards) {
        // initialCards might be manipulated outside this class - make a copy
        // ArrayList<Card> copy = new ArrayList<>(initialCards); // alt. copy = theCards.clone();
        this.theCards = new ArrayList<>(initialCards);
    }

    public int getSize() {
        return theCards.size();
    }

    public void clear() {
        theCards.clear();
    }

    public void add(Card c) {
        theCards.add(c);
    }

    public void add(ArrayList<Card> cards) {
        for (Card card : cards) {
            add(card);
        }
    }

    public Card get(int index) {
        return theCards.get(index);
    }

    public ArrayList<Card> getCards() {
        return new ArrayList<>(this.theCards);
    }

    public Card remove(int index) {
        return theCards.remove(index);
    }

    public boolean remove(Card c) {
        return theCards.remove(c);
    }

    public boolean contains(Card c) {
        return theCards.contains(c);
    }

    public boolean remove(ArrayList<cardutils.Card> cards) {
        return theCards.removeAll(cards);
    }

    public int noOfSuit(Suit suit) {
        int counter = 0;

        for (Card theCard : theCards) {
            if (theCard.getSuit() == suit) {
                counter++;
            }
        }

        return counter;
    }

    public int noOfRank(Rank rank) {
        int counter = 0;

        for (Card theCard : theCards) {
            if (theCard.getRank() == rank) {
                counter++;
            }
        }

        return counter;
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
