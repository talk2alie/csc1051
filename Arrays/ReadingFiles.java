// 1. Import the Scanner class from the java.util package
import java.util.Scanner;

/**
 * ReadingFiles
 */
public class ReadingFiles {

    public static void main(String[] args) {
        // 2. Instantiate a Scanner object.
        //    Note that System.in is how Java represents the keyboard.
        //    So when you create a scanner, you have to tell it from where you 
        //    are reding the input data. Because you are reading from the 
        //    keyboard, you must pass System.in to the Scanner class' 
        //    constructor
        Scanner keyboard = new Scanner(System.in);

        // 3. Ask the user for some input
        System.out.print("Please enter your name: ");

        // 4. Use one of the nextXXX methods of the Scanner object to read the 
        //    data. For example, if what you want to read is an entire line, 
        //    you use the nextLine method
        String name = keyboard.nextLine();

        // 5. Close the scanner
        keyboard.close();

        // 6. Use the data
        System.out.println("Hi there, " + name);
    }
}


