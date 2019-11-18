/**
 * ArraysAsArgument
 */
public class ArraysAsArgument {

    public static void main(String[] args) {
        double[] boilingPoints = {-269.0,-253.0,-246.0,58.8,90.5,2345.0,100.0,85.2,281.9,118,155,0.0,2344.99,98.2,900.0};
        double largestBoilingPoint = getLargestElementFrom(boilingPoints);
        System.out.println("The largest boiling point is: " + largestBoilingPoint);
    }

    private static double getLargestElementFrom(double[] array) {
        // Assume the first element in the array is the highest for now
        double largestElement = array[0];

        // Loop through all the elements of the array starting from the second value, since
        // we have already stored the first element in the largestElement variable
        for(int index = 1; index < array.length; ++index) {

            // Retrieve the element located at the current index
            double currentElement = array[index];
            
            // Check to see if the currentElement is larger than the value
            // currently stored in the largestElement variable
            if(currentElement > largestElement) {
                // If the currentElement is larger than the largestElement
                // so far, replace the value in the largestElement variable 
                // with the value in the currentElement variable
                largestElement = currentElement; 
            }

        }

        // Return the largestElement
        return largestElement;
    }
}


