package Exercise3;

import java.util.ArrayList;

public class Auction {
    private final User owner;
    private final String item;
    private ArrayList<Bid> bids;

    public Auction(User owner, String item) {
        this.owner = owner;
        this.item = item;
        this.bids = new ArrayList<>();
    }

    public void addBid(Bid newBid){
        bids.add(newBid);
    }

    public ArrayList<Bid> getBids() {
        return bids;
    }

    @Override
    public String toString() {
        return "Auction.Auction{" +
                "owner=" + owner +
                ", item='" + item + '\'' +
                ", bids=" + bids +
                '}';
    }
}
