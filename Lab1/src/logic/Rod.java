package logic;

import java.util.Arrays;

public class Rod {

    private final Disk[] diskArr;
    private int numOfDisks;

    public Rod(int initCap) {
        this.diskArr = new Disk[initCap];
        this.numOfDisks = 0;
    }

    @Override
    public String toString() {
        return "Rod: " + Arrays.toString(diskArr) + ", n=" + numOfDisks;
    }

    public int getNumberOfDisks() {
        return numOfDisks;
    }

    public boolean isEmpty() {
        return numOfDisks == 0;
    }

    public Disk peek() {
        return diskArr[numOfDisks - 1];
    }

    public boolean canPush(Disk newDisk) {
        if (isEmpty()) return true;
        Disk top = diskArr[numOfDisks - 1];
        return newDisk.diameter() < top.diameter();
    }

    public void push(Disk newDisk) {
        if (!canPush(newDisk)) throw new IllegalArgumentException("newDisk=" + newDisk);
        this.diskArr[numOfDisks] = newDisk;
        numOfDisks++;
    }

    public Disk pop() {
        if (isEmpty()) throw new IllegalCallerException("Rod is empty, amount of disks on rod: " + this.numOfDisks);
        Disk top = diskArr[numOfDisks - 1];
        numOfDisks--;
        return top;
    }

    public Disk[] copyDiskArr() {
        return Arrays.copyOf(diskArr, this.numOfDisks);
    }

    public void clear() {
        this.numOfDisks = 0;
    }
}