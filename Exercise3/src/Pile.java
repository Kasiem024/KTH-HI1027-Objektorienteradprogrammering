import java.util.ArrayList;

public class Pile {

    private final ArrayList<Card> cards;

    public Pile() {
        this.cards = new ArrayList<>();
    }

    public int getSize(){
        return this.cards.size();
    }

    public void clear(){
        this.cards.clear();
    }

    public void add(Card newCard){
        this.cards.add(newCard);
    }

    public Card get (int index){
        return this.cards.get(index);
    }

    public Card remove (int index){
        return this.cards.remove(index);
    }

    @Override
    public String toString() {
        return "Pile{" +
                "cards=" + cards +
                '}';
    }
}
