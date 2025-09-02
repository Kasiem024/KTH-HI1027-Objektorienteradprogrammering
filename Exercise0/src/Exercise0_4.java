import java.util.Scanner;

public class Exercise0_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Burrtalet: ");
        int number = scan.nextInt();

        for (int i = 1; i < 100; i++) {

            int firstDigit = i % 10;
            int secondDigit = i / 10;

            if (i % number == 0 || firstDigit == number || secondDigit == number) {
                System.out.print(" burr ");
            } else {
                System.out.print(" " + i + " ");
            }
        }
    }
}
