import java.util.Scanner;

/**
 * Write a method that accepts a user's name and prints a greeting to the user
 */
public class WritingParameterAcceptingVoidMethodExample {

    public static void main(String[] args) {
        String userName = getUserName();

        greetUserWithAge(userName, 12);
     }

    private static void greet(String name) {
        System.out.println("Hi, " + name);
    }

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

    private static void greetUserWithAge(String name, int age) {
        String message = age > 15 ? "have fun with the TV" : "It's too late. Go to bed";

        System.out.println("Hi " + name);
        System.out.println(message);
    }
}