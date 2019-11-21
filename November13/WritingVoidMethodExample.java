import java.util.Scanner;

/**
 * Question: Write a method that gets a user's name from the keyboard and greet the user.
 * Constraint: the method should be accessible only in this class
 * Then CALL that method inside the main method when the application starts
 */
public class WritingVoidMethodExample {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("This is a greeting application");
        greetUser();
        System.out.println();
    }

    /**
     * Asks a user for their name and then prints a greeting to the user
     */
    private static void  greetUser() {

        // Get user's name
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = keyboard.nextLine();
        keyboard.close();

        if(name == null) {
            return;
        }

        // Greet uer
        System.out.println("Hi, " + name);

    }    
}