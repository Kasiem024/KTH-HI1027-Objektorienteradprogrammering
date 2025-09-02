import java.util.Scanner;

public class Exercise0_2 {
    public static void main(String[] args) {

        final int ARRAY_SIZE = 5;
        int[] numbers = new int[ARRAY_SIZE];
        Scanner scan = new Scanner(System.in);

        System.out.println("Write 5 numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
