import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private final ArrayList<Card> deck;

    public Deck() {
        deck = new ArrayList<>();

        fill();
    }

    public void fill() {
        deck.clear();

        Suit[] suits = Suit.values();

        for (Suit suit : suits) {
            Rank[] ranks = Rank.values();

            for (Rank rank : ranks) {
                Card newCard = new Card(rank, suit);
                deck.add(newCard);
            }
        }
        shuffle();
    }

    public Card dealCard() {
        Card dealtCard = deck.getFirst();
        deck.removeFirst();

        return dealtCard;
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public int getSize() {
        return this.deck.size();
    }
}
