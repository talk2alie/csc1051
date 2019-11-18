/**
 * ParamsArray
 */
public class ParamsArray {

    public static void main(String[] args) {

        double sum = add(5, 10, 20, 5, 2, 15, 20);
        System.out.println(sum);

    }

    private static double add(double left, double right) {
        return left + right;
    }

    /**
     * Retusn the sum of the numbers provided in the numbers params array
     * @param numbers The numbers to add
     * @return The sum of the numbers given
     */
    private static double add(double... numbers) {
        // Initialize a variable to hold the sum
        double sum = 0.0;

        // Use the for-each loop to sum up the numbers
        // Note that a params array is just a regular array
        for (double number : numbers) {
            // Add the current number to the current sum
            sum += number;
        }

        // Finally, return the sum
        return sum;
    }
}