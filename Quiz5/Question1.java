/**
 * Question1
 */
public class Question1 {

    public static void main(String[] args) {
        double number = 50;
        changeValue(number);
        System.out.println(number);
    }

    private static void changeValue(double value) {
        value += value;
    }
}

