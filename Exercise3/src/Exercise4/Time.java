package Exercise4;

public class Time {
    private int h;
    private int m;
    private int s;

    public Time(int h) {
        this.h = h;
    }

    public Time(int h, int m) {
        this.h = h;
        this.m = m;
    }

    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public void setTime(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public void tic(int s) {

        int hourIncrease = (m * 60 + s) / 3600;

        for (int i = 0; i < hourIncrease; i++) {
            this.h++;
        }

        this.m = (m + (s / 60)) % 60;
    }

    @Override
    public String toString() {
        return "Exercise4.Time{" +
                "h=" + h +
                ", m=" + m +
                ", s=" + s +
                '}';
    }
}
