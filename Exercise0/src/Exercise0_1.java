import java.util.Scanner;

public class Exercise0_1 {
    public static void main(String[] args) {
        final double LOW_INTEREST = 0.005;
        final double HIGH_INTEREST = 0.025;
        final int BALANCE_LIMIT = 100000;
        double interest, bankBalance, amountOverLimit;

        Scanner scan = new Scanner(System.in);
        System.out.println("Hur mycket pengar har du på kontot?");
        bankBalance = scan.nextDouble();

        if (bankBalance < BALANCE_LIMIT) {
            interest = bankBalance * LOW_INTEREST;
        } else {
            amountOverLimit = bankBalance - BALANCE_LIMIT;
            interest = amountOverLimit * HIGH_INTEREST + BALANCE_LIMIT * LOW_INTEREST;
        }

        System.out.println("Ränta = " + interest);
    }
}