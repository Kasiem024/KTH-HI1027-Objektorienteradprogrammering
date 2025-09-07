package logic;

public class Tower {
    private final Rod leftRod;
    private final Rod middleRod;
    private final Rod rightRod;

    private int moves;
    private final int totalNoDisks;

    public Tower(int noOfDisks) {
        this.totalNoDisks = noOfDisks;

        this.rightRod = new Rod(totalNoDisks);
        this.middleRod = new Rod(totalNoDisks);
        this.leftRod = new Rod(totalNoDisks);
    }

    public void initNewGame() {
        this.leftRod.clear();
        this.middleRod.clear();
        this.rightRod.clear();
        this.moves = 0;

        for (int i = totalNoDisks; i > 0; i--) {
            leftRod.push(new Disk(i, Color.WHITE));
        }
    }

    public int getMoves() {
        return moves;
    }

    public int getNoOfDisks() {
        return totalNoDisks;
    }

    public boolean isLegalMove(RodPos fromPos, RodPos toPos) {
        Rod fromRod = getRod(fromPos);
        Rod toRod = getRod(toPos);

        if (fromRod.isEmpty()) return false;
        else return toRod.isEmpty() || fromRod.peek().diameter() < toRod.peek().diameter();
    }

    public void makeMove(RodPos fromPos, RodPos toPos) {

        Rod fromRod = getRod(fromPos);
        Rod toRod = getRod(toPos);

        Disk movingDisk = fromRod.pop();
        toRod.push(movingDisk);

//        getRod(toPos).push(getRod(fromPos).pop());
        this.moves++;
    }

    public boolean isSolved() {

        if (this.rightRod.getNumberOfDisks() == this.totalNoDisks) {

            Disk[] rightRodDisks = getDisks(RodPos.RIGHT);

            for (int i = 1; i < totalNoDisks; i++) {
                System.out.println(rightRodDisks[i].diameter());
                if (rightRodDisks[i - 1].diameter() < rightRodDisks[i].diameter()) {
                    return false;
                }
            }
            return true;

        } else return false;
    }

    public Disk[] getDisks(RodPos pos) {
        return getRod(pos).copyDiskArr();
    }

    private Rod getRod(RodPos rodPos) {
        return switch (rodPos) {
            case LEFT -> this.leftRod;
            case MIDDLE -> this.middleRod;
            case RIGHT -> this.rightRod;
        };
    }

    @Override
    public String toString() {
        return "Tower{" +
                "leftRod=" + leftRod +
                ", middleRod=" + middleRod +
                ", rightRod=" + rightRod +
                ", moves=" + moves +
                ", totalNoDisks=" + totalNoDisks +
                '}';
    }
}