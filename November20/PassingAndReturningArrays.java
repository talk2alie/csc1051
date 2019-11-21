/**
 * PassingAndReturningArrays
 */
public class PassingAndReturningArrays {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 6, 5, 7, 8, 9, 10};
        System.out.print("Before: ");
        printIntArray(numbers);
        swapValuesInIntArray(numbers, 4, 5);
        System.out.print("After: ");
        printIntArray(numbers);

        // int number = 50;
        // changeValue(number);
        // System.out.println(number);
    }


    private static void changeValue(int number) {
        number += number;
    }

    private static void printIntArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void swapValuesInIntArray(int[] numbers, int firstIndex, int secondIndex) {
        // Let's write this together
        int temporary = numbers[firstIndex];
        numbers[firstIndex] = numbers[secondIndex];
        numbers[secondIndex] = temporary;
    }
}