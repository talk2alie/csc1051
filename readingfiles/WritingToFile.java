// Step 1. Import the PrintWriter class from the java.io package
import java.io.IOException;
import java.io.PrintWriter;

/**
 * WritingToFile
 */
public class WritingToFile {

    public static void main(String[] args) throws IOException {
        // 2. Create an instance of the PrintWriter class passing 
        //    the name of the new file to the constructor
        PrintWriter fileWriter = new PrintWriter("students.txt");

        // 3. Call the println or the print methods of the PrintWriter 
        //    object to add text to your file
        fileWriter.println("Here is a list of student Athletes:");
        fileWriter.println("Arnold McDonalds");
        fileWriter.println("Serena Tarplah");
        fileWriter.println("Anrienne Harris");
        fileWriter.println("Courtney Taylor");
        fileWriter.println("Allison Pierce");
        fileWriter.println("Donald Harrison");
        fileWriter.println("Varney passawe");

        // Step 4. Finally, call the close method to close the PrintWriter object and persist your data
        fileWriter.close(); // This line closes the stream and saves the file
    }
}


