import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Grades
 */
public class Grades {

    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many students do you have? ");
        int numberOfGrades = keyboard.nextInt();
        keyboard.nextLine();

        PrintWriter writer = new PrintWriter("grades.txt");
        for (int i = 0; i < numberOfGrades; i++) {
            System.out.print("Please enter Name for student " + (i + 1) + ": ");
            String studentName = keyboard.nextLine();

            System.out.print("Please enter " + studentName + "'s grade: ");
            double studentGrade = keyboard.nextDouble();

            writer.println(studentName + "\t\t" + studentGrade);
            keyboard.nextLine();
        }

        System.out.println("Your file has been saved successfully...");
        writer.close();
        keyboard.close();
    }
}