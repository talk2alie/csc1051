public class PassingAndReturningArraysFromMethods {
    public static void main(String[] args) {
        double[] stocks = {2.5, 4.0, 3.0};
        System.out.println("Stocks before squaring");
        print(stocks);
        System.out.println();

        squareValues(stocks);
        System.out.println("Stocks after squaring");
        print(stocks);
    }

    private static void squareValues(double[] numbersToSquare) {
        
        for (int i = 0; i < numbersToSquare.length; i++) {
            numbersToSquare[i] = numbersToSquare[i] * numbersToSquare[i];
        }
    }

    private static void print(double[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}