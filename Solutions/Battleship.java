import java.util.*;

/**
 * Battleship Soltution
 */
public class Battleship {

    public static void main(String[] args) {
        // Position the ship
        int shipFront = new Random().nextInt(8) + 1;
        int shipMiddle = shipFront + 1;
        int shipBack = shipMiddle + 1;

        Scanner keyboard = new Scanner(System.in);
        int guesses = 0;

        boolean isFrontHit = false;
        boolean isMiddleHit = false;
        boolean isBackHit = false;

        // Play game until user wins
        int 
        do {
            System.out.print("Ready, aim, fire!! Enter a number between 1 and 10 (inclusive) to hit: ");
        } while (isFrontHit && isMiddleHit && isBackHit);
        keyboard.close();
    }

}