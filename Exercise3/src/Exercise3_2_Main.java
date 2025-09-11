import java.util.ArrayList;

public class Exercise3_2_Main {
    public static void main(String[] args) {
        Deck deck1 = new Deck();
        System.out.println(deck1);

        deck1.shuffle();
        System.out.println(deck1);

        // deal 5 cards to a "hand"
        ArrayList<Card> hand = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            Card c = deck1.dealCard();
            System.out.println(c);
            hand.add(c);
        }
        System.out.println(hand);

        // fill the deck1
        deck1.fill();
        System.out.println(deck1);

        Deck deck2 = new Deck();
        deck2.shuffle();

        // create two hands in a card game
        Pile hand1 = new Pile();
        Pile hand2 = new Pile();

        // deal five cards to each hand
        for(int i = 0; i < 5; i++) {
            hand1.add(deck2.dealCard());
            hand2.add(deck2.dealCard());
        }
        System.out.println("first hand : "+ hand1);
        System.out.println("second hand: " + hand2);

        // move the first card in the first hand to the second hand
        Card c = hand1.remove(0);
        hand2.add(c);
        System.out.println("first hand : "+ hand1);
        System.out.println("second hand: " + hand2);

        // clear both hands
        hand1.clear();
        hand2.clear();
        System.out.println("first hand : "+ hand1);
        System.out.println("second hand: " + hand2);
    }
}