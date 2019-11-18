/**
 *  Rewrite this code in VS Code and play with it till you get it
 */
public class ArraysArePassedByValue {

    public static void main(String[] args) {
        short[] dogTricks = {18, 8, 3, 22, 19, 8};
        System.out.println("The array before it was passed to the updateElementAtIndex method: ");
        print(dogTricks);

        int indexToChange = 5;
        short newValue = 22;
        updateElementAtIndex(dogTricks, indexToChange, newValue);
        System.out.println("The array after it was passed to the updateElementAtIndex method: ");
        print(dogTricks);
    }

    /**
     * Prints the elements in the given array to the screen.
     * 
     * @param array The array whose elements you want to print
     */
    private static void print(short[] array) {
        // There are few things I want you to notice in this code:
        // 1. A for loop is very natural when looping through the elements of an array
        // 2. Looping through an array always starts from 0 and ends at the array's length - 1; 
        //    that's why the condition is index < array.length
        for(int index = 0; index < array.length; ++index) {
            System.out.print(array[index] + " ");
        }
        System.out.println();
    }

    /**
     * Replaces the value at indexToChange with newValue
     * @param array The array to modify
     * @param indexToChange The index of the value to modify
     * @param newValue The value with which to modify the array
     */
    private static void updateElementAtIndex(short[] array, int indexToChange, short newValue) {
        array[indexToChange] = newValue;
    }
}


