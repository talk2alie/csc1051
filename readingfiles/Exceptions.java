import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Exceptions
 */
public class Exceptions {

    public static void main(String[] args) {
        final String filePath = "boilingPoints.txt";
        File file = new File(filePath);
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String currentLine = fileReader.nextLine();    
                
                int boilingPoint = Integer.parseInt(currentLine);

                // NOTE: The following statement could cause an ArithmeticException.
                //       When that happens, execution of this code will never reach line 28
                //       to close the scanner. Therefore, we will have memory leak in our program
                double quotient = boilingPoint / 0; 
                System.out.println(quotient);
            }
    
            
        } catch (FileNotFoundException exception)  {
            System.out.println("A file not found exception occurred. Here is the message: ");
            System.out.println(exception.getMessage());
        } catch (Exception exception) {
            System.out.println("This is a catch all block. I will catch any exception that wasn't caught before me");
            System.out.println(exception.getMessage());
        } finally {
            // NOTE: This block will always execute whether an exception occurs or not
            //       It is the perfect place to clean up. For example, it is the perfect
            //       place to close the scanner object
            if(fileReader != null) {
                fileReader.close();
            }
            // Since we are closing the scanner here, we no longer need to close on line 28
        }
    }
}

