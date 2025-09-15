import cardutils.Card;
import ps.PsLogic;

import java.util.Scanner;

public class PsUserInterface {
    private final PsLogic psLogic;
    private final Scanner scan;

    public PsUserInterface() {
        this.psLogic = new PsLogic();
        this.scan = new Scanner(System.in);
    }

    public void run() {
        char choice;
        String answer;

        do {
            printMenu();
            answer = scan.nextLine();
            answer = answer.toUpperCase();
            choice = answer.charAt(0);

            switch (choice) {
                case 'N':
                    newGame();
                    break;
                case 'X':
                    System.out.println("Bye, bye!");
                    break;
                default:
                    System.out.println("Unknown command");
            }
        } while (choice != 'X');
    }

    public void newGame() {
        System.out.println("Initializing a new game...");
        psLogic.initNewGame();
        System.out.println("Ready.");

        while (!psLogic.isGameOver()) {
            pickACard();
        }

        System.out.println("Game is over!");
        System.out.println("You got " + psLogic.getPoints() + " points");
    }

    public void pickACard() {
        Card nextCard = psLogic.pickNextCard();
        System.out.println(psLogic);
        System.out.println("Next card: " + psLogic.toShortString());
        System.out.println("Select a pile [0...4]: ");
        String ans = scan.nextLine();
        int index = Integer.parseInt(ans.trim());
        psLogic.addCardToPile(index);
    }

    public void printMenu(){
        System.out.println("---Menu---");
        System.out.println("N Start a new game");
        System.out.println("X Exit");
        System.out.println("----------");
    }
}
