// 1. Import the Scanner class from the java.util package
import java.util.Scanner;
// 2. Import the File and FileNotFoundException classes from the java.io package
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Reads user input from a file and display the content to the screen
 */
public class ReadingUserInputFromFile {

    // Note the throws expression in the main method's header
    public static void main(String[] args) throws FileNotFoundException {
        // 3. Specify the name of the file containing the user input
        final String fileName = "boilingpoints.txt"; // Note the file name matches our file

        // 4. Instantiate a File object and pass the fileName to the constructor
        File file = new File(fileName);

        // 5. Instantiate a Scanner object passing the file object instead of our
        //    our regular System.in for reading keyboard input
        Scanner fileReader = new Scanner(file);
        
        // 6. Repeatedly read a line from the file until the Scanner object's 
        //    hasNextLine method returns false
        while (fileReader.hasNextLine()) {
            // Read a line from the file and move the scanner to the beginning of the next line
            String currentLine = fileReader.nextLine();

            // Display the line to the screen
            System.out.println("Line from file: " + currentLine);
        }

        // 7. Close the scanner to avoid memory leak.
        //    Note, if you left this step out in a quiz, you will lose points
        fileReader.close();
    }
}