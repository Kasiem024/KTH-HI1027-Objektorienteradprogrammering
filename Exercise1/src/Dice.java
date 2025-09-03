public class Dice {

    private int value;

    public Dice() {
        this.value = 1;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "value=" + value;
    }

    public int throwDice() {
        this.value = (int) (Math.random() * 6 + 1);

        return  value;
    }
}