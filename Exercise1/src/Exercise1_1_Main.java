public class Exercise1_1_Main {
    public static void main(String[] args) {

        Dice d1 = new Dice();
        Dice d2 = new Dice();

        final int amountThrows = 1000;

        int[] frequencyArray1 = new int[7];

        for (int i = 0; i < amountThrows; i++) {
            d1.throwDice();
            d2.throwDice();
            System.out.println(d1 + ", " + d2);
            frequencyArray1[d1.getValue()]++;
        }

        for (int i = 1; i < frequencyArray1.length; i++) {
            System.out.println("The number " + i + " has shown up: " + frequencyArray1[i]);
        }
    }
}