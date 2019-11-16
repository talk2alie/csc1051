import java.util.*;

/**
 * Battleship Soltution
 */
public class Battleship {

    public static void main(String[] args) {
        // Create top padding
        System.out.println();

        // Position the ship
        int theShipsFront = new Random().nextInt(8) + 1;
        int theShipsMiddle = theShipsFront + 1;
        int theShipsBack = theShipsMiddle + 1;

        // Set up environment
        Scanner keyboard = new Scanner(System.in);
        int guesses = 0;

        boolean theShipsFrontHasBeenHit = false;
        boolean theShipsMiddleHasBeenHit = false;
        boolean theShipsBackHasBeenHit = false;

        // Play game until user wins
        int theUsersGuess;
        do {
            System.out.print("Ready, aim, fire!! Enter a number between 1 and 10 (inclusive) to hit: ");
            theUsersGuess = keyboard.nextInt();
            guesses++;

            // The user's guess is outside of the grid
            if (theUsersGuess < 1 || theUsersGuess > 10) {
                // Print an invalid position error
                System.out.println("Invalid position");

                // End the iteration immediately. remember that the continue keyword
                // will end the current iteration when the rest of the loop body
                // no longer needs to run. If the user entered an invalid position,
                // there is nothing else to test. So we end the iteration now. This
                // also reduces the number of else clauses
                continue;
            }

            // If the user's guess is the ship's front and she has already hit it before
            // or if the user's guess is the ship's middle and she has already hit it before
            // or if the user's guess is the ship's back and she has already hit it before
            if ((theUsersGuess == theShipsFront && theShipsFrontHasBeenHit)
                    || (theUsersGuess == theShipsMiddle && theShipsMiddleHasBeenHit)
                    || (theUsersGuess == theShipsBack && theShipsBackHasBeenHit)) {
                // Print already hit that section message
                System.out.println("You have already hit that section");

                // After that, there is no need to continue through the loop body.
                // End the iteration now
                continue;
            }

            // The user's guess is a hit
            if (theUsersGuess == theShipsFront || theUsersGuess == theShipsMiddle || theUsersGuess == theShipsBack) {
                // Print hit message.
                // Note that this design will print Hit 3 times instead of 2 before printing sink message
                // I realize this is a more expressive design than what the problem asked for
                // If you did not do this, no one cares. :-)
                System.out.println("Hit!!");

                // Update the ship's front hit flag if it were not yet hit
                theShipsFrontHasBeenHit = theShipsFrontHasBeenHit ? theShipsFrontHasBeenHit : theUsersGuess == theShipsFront;

                // Update the ship's middle flag if it were not yet hit
                theShipsMiddleHasBeenHit = theShipsMiddleHasBeenHit ? theShipsMiddleHasBeenHit : theUsersGuess == theShipsMiddle;

                // Update the ship's back flag if it were not yet hit
                theShipsBackHasBeenHit = theShipsBackHasBeenHit ? theShipsBackHasBeenHit : theUsersGuess == theShipsBack;
            } 
            else {
                // Well, if it's not a hit and it's not an invalid guess, it's probably a miss. :-)
                System.out.println("Miss!!");
            }

        } while (!theShipsFrontHasBeenHit || !theShipsMiddleHasBeenHit || !theShipsBackHasBeenHit);
        keyboard.close();

        System.out.println("Congrats!! You sank my ship after " + guesses + " guesses");

        // Create bottom padding
        System.out.println();
    }
}