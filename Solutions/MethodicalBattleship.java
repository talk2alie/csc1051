import java.util.Random;
import java.util.Scanner;

/**
 * MethodicalBattleship
 */
public class MethodicalBattleship {

    public static void main(String[] args) {
        System.out.println();

        int theShipsFront = new Random().nextInt(8) + 1;
        int theShipsMiddle = theShipsFront + 1;
        int theShipsBack = theShipsMiddle + 1;

        Scanner keyboard = new Scanner(System.in);
        int guesses = 0;

        boolean theShipsFrontHasBeenHit = false;
        boolean theShipsMiddleHasBeenHit = false;
        boolean theShipsBackHasBeenHit = false;

        int theUsersGuess;
        do {
            theUsersGuess = getUsersGuessFrom(keyboard);
            guesses++;

            if (isOutsideOfTheGrid(theUsersGuess)) {
                System.out.println("Invalid position");
                continue;
            }

            if ((theUsersGuess == theShipsFront && theShipsFrontHasBeenHit)
                    || (theUsersGuess == theShipsMiddle && theShipsMiddleHasBeenHit)
                    || (theUsersGuess == theShipsBack && theShipsBackHasBeenHit)) {
                System.out.println("You have already hit that section");
                continue;
            }

            if (isAHitOnASectionOfTheShip(theUsersGuess, theShipsFront, theShipsMiddle, theShipsBack)) {
                System.out.println("Hit!!");

                theShipsFrontHasBeenHit = theShipsFrontHasBeenHit ? theShipsFrontHasBeenHit
                        : theUsersGuess == theShipsFront;
                theShipsMiddleHasBeenHit = theShipsMiddleHasBeenHit ? theShipsMiddleHasBeenHit
                        : theUsersGuess == theShipsMiddle;
                theShipsBackHasBeenHit = theShipsBackHasBeenHit ? theShipsBackHasBeenHit
                        : theUsersGuess == theShipsBack;
            } else {
                System.out.println("Miss!!");
            }

        } while (!hasSunkTheShip(theShipsFrontHasBeenHit, theShipsMiddleHasBeenHit, theShipsBackHasBeenHit));
        keyboard.close();

        System.out.println("Congrats!! You sank my ship after " + guesses + " guesses");
        System.out.println();
    }

    private static boolean hasSunkTheShip(boolean theShipsFrontHasBeenHit, boolean theShipsMiddleHasBeenHit,
            boolean theShipsBackHasBeenHit) {
        return theShipsFrontHasBeenHit && theShipsMiddleHasBeenHit && theShipsBackHasBeenHit;
    }

    private static boolean isAHitOnASectionOfTheShip(int theUsersGuess, int theShipsFront, int theShipsMiddle,
            int theShipsBack) {
        return theUsersGuess == theShipsFront || theUsersGuess == theShipsMiddle || theUsersGuess == theShipsBack;
    }

    private static int getUsersGuessFrom(Scanner keyboard) {
        int theUsersGuess;
        System.out.print("Ready, aim, fire!! Enter a number between 1 and 10 (inclusive) to hit: ");
        theUsersGuess = keyboard.nextInt();
        return theUsersGuess;
    }

    private static boolean isOutsideOfTheGrid(int theUsersGuess) {
        final int FIRST_CCELL = 1;
        final int LAST_CELL = 10;
        return theUsersGuess < FIRST_CCELL || theUsersGuess > LAST_CELL;
    }
}