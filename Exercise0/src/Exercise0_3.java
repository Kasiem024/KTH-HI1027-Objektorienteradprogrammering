public class Exercise0_3 {
    public static void main(String[] args) {

        final int AMOUNT_DICE_THROWS = 1000;
        int[] frequencyArray = new int[7];

        for (int i = 0; i < AMOUNT_DICE_THROWS; i++) {
            int diceThrow = (int) (Math.random() * 6 + 1);
            frequencyArray[diceThrow]++;
        }

        for (int i = 1; i < frequencyArray.length; i++) {
            System.out.println("The number " + i + " has shown up: " + frequencyArray[i]);
        }
    }
}
