package logic;

public class Tower {
    private final Rod left;
    private final Rod middle;
    private final Rod right;

    private int moves;
    private final int totalNoOfDisks;

    public Tower(int noOfDisks) {
        totalNoOfDisks = noOfDisks;

        this.right = new Rod(totalNoOfDisks);
        this.middle = new Rod(totalNoOfDisks);
        this.left = new Rod(totalNoOfDisks);
    }

    public void initNewGame() {
        this.left.clear();
        this.middle.clear();
        this.right.clear();
        moves = 0;

        for (int i = totalNoOfDisks; i > 0; i--) {
            left.push(new Disk(i, Color.WHITE));
        }
    }

    public int getMoves() {
        return moves;
    }

    public int getNoOfDisks() {
        return totalNoOfDisks;
    }

    public boolean isLegalMove(RodPos fromPos, RodPos toPos) {
        Rod fromRod = getRod(fromPos);
        Rod toRod = getRod(toPos);

        if (fromRod.isEmpty()) return false;
        else return fromRod.peek().diameter() < toRod.peek().diameter() || toRod.isEmpty();
    }

    public void makeMove(RodPos fromPos, RodPos toPos) {
        if (!isLegalMove(fromPos, toPos)) {
            throw new IllegalStateException("Illegal move.");
        }

        Rod fromRod = getRod(fromPos);
        Rod toRod = getRod(toPos);

        Disk movingDisk = fromRod.pop();
        toRod.push(movingDisk);

//        getRod(toPos).push(getRod(fromPos).pop());
        this.moves++;
    }

    public boolean isSolved() {
        return this.right.getNumberOfDisks() == this.totalNoOfDisks;
    }

    public Disk[] getDisks(RodPos pos) {
        return getRod(pos).copyDiskArr();
    }

    private Rod getRod(RodPos rodPos) {
        return switch (rodPos) {
            case LEFT -> this.left;
            case MIDDLE -> this.middle;
            case RIGHT -> this.right;
        };
    }
}