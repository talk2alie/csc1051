// 1. Import the Scanner class from the java.util package
import java.util.Scanner;
import java.io.*;

/**
 * This application reads the boiling points from a file 
 * and displays them on screen
 */
public class ReadingUserInputFromFile {

    public static void main(String[] args) throws FileNotFoundException {
        // Add top padding

        // 2. Create a file object for the file that has the user input
        final String filePath = "boilingpoints.txt";
        File file = new File(filePath);

        
        Scanner fileReader = new Scanner(file);

        // 3. All you do now is loop through each line in the file as long
        //    as the scanner object's hasNextLine method returns true 
        while (fileReader.hasNextLine()) {
            // Just like when reading the user input from a keyboard,
            // the nextLine method will return the current line in the file.
            // All you will do is read the line and store or use the value
            String currentLine = fileReader.nextLine().trim();

            // Since you know there is a double on each line in the file,
            // use the parseDouble method of the Double wrapper class to 
            // convert the line to an actual double value of the boiling point 
            double boilingPoint = Double.parseDouble(currentLine);

            // Finally, print the value
            System.out.println(boilingPoint);
        }

        // 4. Close the scanner. This is required to reclaim system resources
        // FYI, if you leave this out in a quiz, you will lose points
        fileReader.close();

        // Add bottom padding
        System.out.println();
    }   
}


