/**
 * Average
 */
public class Average {

    public static void main(String[] args) {
        float average = getAverage(10, 10, 10, 10, 10);
        System.out.println(average);
    }

    private static float getAverage(float numberOne, float numberTwo, float numberThree, float numberFour, float numberFive){
            return ((numberOne + numberTwo + numberThree + numberFour + numberFive) / 5);
    }
}