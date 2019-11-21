import java.util.Scanner;
import java.io.PrintWriter;
import java.io.IOException;

public class Students {

    public static void main(String[] args) {
        try {
            // I create my Scanner to ask the user for the list
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Please enter a comma separated list of student names: ");

            // I store whatever the user gave me in the userInput variable
            String userInput = keyboard.nextLine();
            keyboard.close();

            // It turns out the String object has a method called split that can 
            // split a string into pieces based on a specific character, put all 
            // the pieces in a String array and return it. Note that I am using 
            // a comma as the character to split by
            String[] studentNames = userInput.split(",");

            // Now I will create my PrintWriter object
            final String fileName = "students.txt";
            PrintWriter writer = new PrintWriter(fileName);

            // I will then loop through the studentNames array and write each name 
            // to the file
            for (int index = 0; index < studentNames.length; index++) {
                // I am calling the trim method on the string that is located 
                // at the given index to remove whitespace from around it
                writer.println(studentNames[index].trim());
            }

            // Once I am done writing everything, I will close the file.
            // Note that I have not closed the file inside the loop body
            // If I did that, my code will break because I would have 
            // closed the file prematuredly
            writer.close();
        } catch (IOException e) {
            System.out.println("There eas an error: " + e.getMessage());
        }
    }
}

