package ps;

import cardutils.*;

public class PokerHands {

    private PokerHands() {
    }

    public static PokerCombo getPokerCombo(Pile p) {
        if (p.getSize() != 5) throw new IllegalArgumentException("Pile is wrong size");

        if (isRoyalFlush(p)) return PokerCombo.ROYAL_FLUSH;
        else if (is4Kind(p)) return PokerCombo.FOUR_OF_A_KIND;
        else if (isFullHouse(p)) return PokerCombo.FULL_HOUSE;
        else if (is3Kind(p)) return PokerCombo.THREE_OF_A_KIND;
        else if (isFlush(p)) return PokerCombo.FLUSH;
        else if (is2Pair(p)) return PokerCombo.TWO_PAIRS;
        else if (is1Pair(p)) return PokerCombo.PAIR;
        else return PokerCombo.NONE;
    }

    private static boolean isRoyalFlush(Pile p) {
        Suit cardSuit = p.get(0).getSuit();
        if (p.noOfSuit(cardSuit) != 5) return false;

        int counter = 0;
        for (int i = 0; i < 5; i++) {
            Rank cardRank = p.get(i).getRank();
            if (cardRank == Rank.ACE) counter++;
            else if (cardRank == Rank.KING) counter++;
            else if (cardRank == Rank.QUEEN) counter++;
            else if (cardRank == Rank.JACK) counter++;
            else if (cardRank == Rank.TEN) counter++;
        }
        return counter == 5;
    }

    private static boolean is4Kind(Pile p) {
        for (Rank rank : Rank.values()) {
            if (p.noOfRank(rank) >= 4) {
                return true;
            }
        }

        return false;
    }

    private static boolean isFullHouse(Pile p) {
        for (Rank rank1 : Rank.values()) {
            if (p.noOfRank(rank1) == 3) {
                for (Rank rank2 : Rank.values()) {
                    if (p.noOfRank(rank2) == 2 && rank1 != rank2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean is3Kind(Pile p) {
        for (Rank rank : Rank.values()) {
            if (p.noOfRank(rank) >= 3) {
                return true;
            }
        }
        return false;
    }

    private static boolean isFlush(Pile p) {
        for (Suit suit : Suit.values()) {
            if (p.noOfSuit(suit) == 5) {
                return true;
            }
        }
        return false;
    }

    private static boolean is2Pair(Pile p) {
        for (Rank rank1 : Rank.values()) {
            if (p.noOfRank(rank1) == 2) {
                for (Rank rank2 : Rank.values()) {
                    if (p.noOfRank(rank2) == 2 && rank1 != rank2) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean is1Pair(Pile p) {
        for (Rank rank : Rank.values()) {
            if (p.noOfRank(rank) == 2) {
                return true;
            }
        }
        return false;
    }
}
