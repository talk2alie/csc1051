/**
 * Introduction
 */
public class Introduction {

    public static void main(String[] args) {

        byte[] dogTricks;
        dogTricks = new byte[] {18, 8, 3, 22, 19, 8};
        int numberOfDogTricks = dogTricks.length;
        System.out.println(numberOfDogTricks);


        // Oh we just realized the value we entered for the last dog's
        // tricks is incorrect. So we need to change it
        dogTricks[5] = 12;

        byte highestNumberOfTricks = dogTricks[3];
        System.out.println("The higest number of tricks in the list is " + highestNumberOfTricks);

        // Declare and initialize the scores variable with the scores
        // short[] scores = {35, 28, 22, 21, 19, 38, 44, 56, 60, 22};

        // scores[2] = 55;

        // // Retrieve 44 from the array and store it in the seventhScore variable
        // short seventhScore = scores[6];

        // // Print the value of the variable
        // System.out.println("The 7th score is " + seventhScore);

        // // You could also use the value directly in a statement without storing 
        // // it in a variable
        // System.out.println("The 8th score is " + scores[7]);

        // // You can also use the values in an arithmetic operation
        // System.out.println("The sum of the 2nd and last elements is " + (scores[1] + scores[9]));
    }

    
}

        // short seventhScore = scores[6];

        // System.out.println(seventhScore);

        // double[] boilingPoints;

        // boilingPoints = new double[15];

        // // boilingPoints = new double[] {-269.0,-253.0,-246.0,58.8,90.5,2345.0,100.0,85.2,281.9,118,155,0.0,2344.99,98.2,900.0};

        // // double averageBoilingPoint = -269.0;
        // // double boilingPoint = averageBoilingPoint;

        // // System.out.println(boilingPoint);
        // for(int i = 0; i < boilingPoints.length; ++i) {
        //     System.out.println(scores[i]);
        // }