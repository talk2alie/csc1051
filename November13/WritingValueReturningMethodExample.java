import java.util.Scanner;

/**
 * Question: Write a method that gets a user's name from the keyboard and returns it to a calling code. 
 * 
 * Constraint: the method should be accessible only in this class.
 * Then CALL that method inside the main method when the application starts
 * Assign the retuned value to a variable and then print a greeting
 * 
 * Note: This method is very similar to the void method we wrote earlier, except 
 * now, instead of printing the user's name, we return it and let a different 
 * code be responsible for greeting the user
 */
public class WritingValueReturningMethodExample {

    public static void main(String[] args) {
       System.out.println("Hi, " + getUserName());
    }

    /**
     *  Asks a user to enter their name and returns it
     * @return A user's name 
     */
    private static String getUserName() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();
        keyboard.close();

        if(name != null) {
            return name;
        }
        
        return "";        
    }

    private static short addTwoNumbers() {
        short left = 10;
        short right = 5;
        return (short)(left + right);
    }
}