/**
 * InitializingArrayVariables
 */
public class InitializingArrayVariables {

    public static void main(String[] args) {
        // Declaring an array variable is identical to declaring any other variable.
        // The data type of the values in the array followed by the opening and 
        // closing curly and the variable name. End with a semi-colon
        // E.g.
        double[] scores;

        // There are 3 ways to initialize an array variable once it has been declared as above

        // 1. Initializing an array variable with an array initializer
        scores = new double[] {1, 2.5, 3.8, 38.5, 100, 98, 45, 33, 40, 12};

        // 2. An array constructor (or indexer)
        scores = new double[10];

        // 3. Finally, we can initialize an array with a method call or by assigning it 
        //    a variable that has a reference to another array (More on this later)
        
        // 3a. Initializing an array variable with a method call
        scores = getScores();

        // 3b. Initializing an array with a reference stored in another variable
        double[] oldScores = new double[] {1, 2.5, 3.8, 38.5, 100, 98, 45, 33, 40, 12};
        scores = oldScores;

        // In short, an array variable is like any other variable
    }

    private static double[] getScores() {
        return new double[] {1, 2.5, 3.8, 38.5, 100, 98, 45, 33, 40, 12};
    }
}