import java.util.Random;

/**
 * ReturningArraysFromMethods
 */
public class ReturningArraysFromMethods {

    public static void main(String[] args) {
        int[] shipPositions = generateRandomPositions();
        System.out.println("The positions of the ship are: ");
        print(shipPositions);
    }

    /**
     * Prints the elements in the given array to the screen.
     * 
     * @param array The array whose elements you want to print
     */
    private static void print(int[] array) {
        for(int index = 0; index < array.length; ++index) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    private static int[] generateRandomPositions() {
        // Generate the position of the front of the ship at random
        int front = new Random().nextInt(8) + 1;

        // We then return a int array initializer where the first element 
        // is the generated front and the middle and back are just the front 
        // plus 1 and front plus 2 respectively.
        return new int[] {front, front + 1, front + 2};
    }
}

