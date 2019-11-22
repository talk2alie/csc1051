import java.text.NumberFormat;
import java.util.Scanner;

/**
 * The point of this program is to point out that even with just an 
 * understanding of core concepts like conditionals, loops, variables,
 * objects and fields, you can do amazing things with programmatic 
 * thinking. 
 * 
 * This application is a retail store teller machine. Imagine the 
 * application is the cashier that takes orders from you when you 
 * visit a shoe store. It asks you for the shoe you want to buy. 
 * If that shoe is in stock, it asks you hpw many you want. If 
 * that quantity of the shoe is available, it serves you and prints 
 * a reciept; otherwise, it tells you the quantity of the shoe that 
 * is available in stock.
 * 
 * I have started the program off for you. All you have to do is 
 * complete the body of the methods I have left for you. 
 * 
 * YOU MUST NOT MODIFY THE HEADER OF ANY OF THE METHODS. YOU CAN 
 * ONLY WRITE YOUR CODE IN THE METHOD BODY THAT HAS THE TEXT: 
 * "TODO: T..."
 */
public class ShoesByLisa {

    // You can customize this array
    private static final String[] shoesInStock = { 
        "Crocs", 
        "Air Force One", 
        "Eazies", 
        "McLaren's", 
        "Air Freeze",
        "Sketcher's Cloud", 
        "Nothinhams" 
    };

    // You can customize this array
    private static final double[] shoesInStockPrices = {120.99, 75, 189.95, 200, 65, 44.99, 110};

    // You can customize this array
    private static final int[] shoesInStockQuantities = { 23, 18, 2, 15, 4, 9, 0 };

    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println();

        printGreeting();

        String shoeName = getShoeNameFromBuyer();
        int shoeId = findShoeIdBy(shoeName);
        if(shoeId < 0) {
            printShoeOutOfStockMessageFor(shoeName);
            return;
        }
        
        if (!isInStock(shoeId)) {
            printShoeOutOfStockMessageFor(shoeName);
            return;
        }

        int shoeQuantity = getShoeQuantityFromBuyer(shoeName);
        if(!weHaveRequetedQuantityInStock(shoeId, shoeQuantity)) {
            printLimitedQuantityMessageFor(shoeId);
        }

        makeSale(shoeId, shoeQuantity);

        keyboard.close();
        System.out.println();
    }

    private static void makeSale(int shoeId, int shoeQuantity) {
        shoesInStockQuantities[shoeId] -= shoeQuantity;
        double subTotal = shoesInStockPrices[shoeId] * shoeQuantity;

        printReciept(shoeId, shoeQuantity, subTotal);
    }

    private static void printReciept(int shoeId, int shoeQuantity, double subTotal) {
        final double TAX_RATE = 0.06;
        double total = subTotal + (subTotal * TAX_RATE);

        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("Thank you for choosing us for your shoe needs");
        System.out.println("Here is your receipt");
        System.out.println();
        System.out.printf("Shoe Name:%35s\n", shoesInStock[shoeId]);
        System.out.printf("Quantity:%36d\n", shoeQuantity);

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        
        System.out.printf("Price:%39s\n", formatter.format(shoesInStockPrices[shoeId]));
        System.out.printf("Subtotal:%36s\n", formatter.format(subTotal));
        double taxAmount = subTotal * TAX_RATE;
        System.out.printf("Tax:%41s\n", formatter.format(taxAmount));
        System.out.printf("Total:%39s\n", formatter.format(total));
        System.out.println("---------------------------------------------");
    }

    private static void printLimitedQuantityMessageFor(int shoeId) {
        int availableQuantity = shoesInStockQuantities[shoeId];
        String shoeName = shoesInStock[shoeId];
        
        if(shoesInStockQuantities[shoeId] == 0) {
            printShoeOutOfStockMessageFor(shoeName);
            return;
        }

        System.out.println("Sorry, we only have " + availableQuantity + " of the " + shoeName + "s left.");
    }

    private static boolean weHaveRequetedQuantityInStock(int shoeId, int requestedQuantity) {
        return shoesInStockQuantities[shoeId] >= requestedQuantity;
    }

    private static void printShoeQuantityErrorMessage() {
        System.out.println();
        System.out.println("The quantity you entered is invalid. Please enter a positive whole number.");
    }

    private static int getShoeQuantityFromBuyer(String shoeName) {
        System.out.println();
        try {

            System.out.print("How many " + shoeName + "s would you like today? ");
            int shoeQuantity = keyboard.nextInt();
            keyboard.nextLine();
            if(shoeQuantity < 1) {
                printShoeQuantityErrorMessage();

            // This is called recursion; calling a method inside itself
            // The net effect of this is similar to using a loop to repeatedly 
            // ask the buyer for a valid shoe quantity
            // We will learn about it in 1052
                shoeQuantity = getShoeQuantityFromBuyer(shoeName);
            }

            return shoeQuantity;
        } catch(Exception e) {
            printShoeQuantityErrorMessage();
            return getShoeQuantityFromBuyer(shoeName);
        }
    }

    private static boolean isInStock(int shoeId) {
        return shoesInStockQuantities[shoeId] > 0;
    }

    private static void printShoeOutOfStockMessageFor(String shoeName) {
        System.out.println();
        System.out.println("Sorry, we are all out of " + shoeName + ".");
        System.out.println("Please come again later.");
    }

    private static int findShoeIdBy(String shoeName) {

        for (int index = 0; index < shoesInStock.length; ++index) {
            if (shoesInStock[index].equalsIgnoreCase(shoeName)) {
                return index;
            }
        }

        return -1;
    }

    private static String getShoeNameFromBuyer() {
        System.out.println();

        System.out.print("What shoe would you like today? ");
        String shoeName = keyboard.nextLine();
        if(shoeName.trim().equals("")) {
            printShoeNameErrorMessage();
            // This is called recursion; calling a method inside itself
            // The net effect of this is similar to using a loop to repeatedly 
            // ask the buyer for a valid shoe name
            // We will learn about it in 1052
            shoeName = getShoeNameFromBuyer();
        }

        return shoeName;
    }

    private static void printShoeNameErrorMessage() {
        System.out.println();
        System.out.println("Please enter a valid shoe name.");
    }

    private static void printGreeting() {
        System.out.println("Hi, thank you for visiting us today.");
        System.out.println("We have all the latest in shoe designs.");
    }
}