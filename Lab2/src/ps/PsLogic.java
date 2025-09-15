package ps;

import cardutils.*;

import java.util.ArrayList;

import static ps.PokerHands.getPokerCombo;

public class PsLogic implements IPsLogic {
    private Card nextCard;
    private final Deck deck;
    private final ArrayList<Pile> piles;

    public PsLogic() {
        this.nextCard = null;
        this.deck = new Deck();
        this.piles = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {
            this.piles.add(new Pile());
        }
    }

    public void initNewGame() {
        this.deck.fill();
        this.deck.shuffle();

        this.nextCard = null;

        for (Pile pile : this.piles) {
            pile.clear();
        }
    }

    public int getCardCount() {
        int counter = 0;
        for (Pile pile : this.piles) {
            counter += pile.getSize();
        }
        return counter;
    }

    public Card pickNextCard() {
        if (this.nextCard != null) throw new IllegalStateException("nextCard is not null.");
        this.nextCard = deck.dealCard();
        return this.nextCard;
    }

    public void addCardToPile(int pile) {
        if (this.nextCard == null) throw new IllegalStateException("nextCard is null.");

        if (this.piles.get(pile).getSize() >= 5) throw new IllegalArgumentException("Too many cards in one pile.");


        this.piles.get(pile).add(this.nextCard);

        this.nextCard = null;
    }

    public ArrayList<Pile> getPiles() {
        ArrayList<Pile> pilesCopy = new ArrayList<>();

        for (Pile originalPile : this.piles) {
            pilesCopy.add(new Pile(originalPile.getCards()));
        }
        return pilesCopy;
    }

    public boolean isGameOver() {
        return getCardCount() >= 25;
    }

    public int getPoints() {
        int counter = 0;
        for (Pile pile : this.piles) {
            counter += getPokerCombo(pile).getComboPoints();
        }
        return counter;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("\n");
        for (Pile pile : this.piles) {
            builder.append(pile.toString());
            builder.append("\n");
        }
        builder.append("\n");
        return builder.toString();
    }

    public String toShortString() {
        return this.nextCard.toShortString();
    }
}
