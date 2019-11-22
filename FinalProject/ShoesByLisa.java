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

    /**
     * Given a shoeId and a quantity, will make a sale and print a reciept
     * @param shoeId The index that identifies either the name, price or quantity of a shoe
     * @param shoeQuantity The number of shoes the buyer wants to buy
     */
    private static void makeSale(int shoeId, int shoeQuantity) {
        // TODO: Complete this method

        // To make a sale, do the following
        // 1. Subtract the value stored in the shoeQuantity parameter
        //    from the value located at the index stored in the shoeId 
        //    parameter, in the shoesInStockQuantities array
        // 2. Print the user's reciept. Ensure that the reciept includes
        //    sales tax if you do not want to get in trouble with the IRS
        // NOTE: I have written a printReciept method for you below. Use it
        //       if you want
    }

    /**
     * Given some information, will calculate the sales tax and print a reciept
     * @param shoeId The index that identifies the name, price or quantity of a shoe
     * @param shoeQuantity The number of shoes the buyer has purchased
     * @param subTotal The product of multiplying the number of shoes and the unit price of the shoe
     */
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

    /**
     * Prints a message that indicates either we are out of a shoe or the remaining number of a given 
     * shoe we have
     * @param shoeId The index that identifies the name, price or quantity of a shoe
     */
    private static void printLimitedQuantityMessageFor(int shoeId) {
        int availableQuantity = shoesInStockQuantities[shoeId];
        String shoeName = shoesInStock[shoeId];
        
        if(shoesInStockQuantities[shoeId] == 0) {
            printShoeOutOfStockMessageFor(shoeName);
            return;
        }

        System.out.println("Sorry, we only have " + availableQuantity + " of the " + shoeName + "s left.");
    }

    /**
     * Returns a value that indicates whether we have the number of shoes the buyer wants
     * @param shoeId The index that identifies the name, price or quantity of a shoe
     * @param requestedQuantity The number of shoes the buyer wants to buy
     * @return True if we have the number of shoes the buyer wants; false, otherwise
     */
    private static boolean weHaveRequetedQuantityInStock(int shoeId, int requestedQuantity) {
        // TODO: Complete this method

        // Write code here that determins whether we have the number of shoes the user wants.
        // To accomplish that, do the following
        // Look in the shoesInStockQuantities array for the value located at the index passed 
        // in the shoeId variable and check whether that value is larger than or the same 
        // as the value in the requestedQuantity parameter
    }

    /**
     * Prints a message that indicates the buyer has requested an invalid number of shoes
     */
    private static void printShoeQuantityErrorMessage() {
        System.out.println();
        System.out.println("The quantity you entered is invalid. Please enter a positive whole number.");
    }

    /**
     * Requests the quantity of shoes from the buyer recursively and returns it
     * @param shoeName The name of the shoe the buyer wants to buy
     * @return The number of shoes the buyer wants to buy
     */
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

    /**
     * Gets a value that indicates whether we have a given shoe in stock
     * @param shoeId The index that identifies the shoe the buyer wants
     * @return True if we have the shoe; false, otherwise
     */
    private static boolean isInStock(int shoeId) {
        // Write code here that returns true if we have at least of the given shoes
        // Note that shoeId is an index of a shoe in the arrays at the top of this file
    }

    /**
     * Prints a message that indicates that we are of stock for the given shoe
     * @param shoeName The name of the shoe we no longer have
     */
    private static void printShoeOutOfStockMessageFor(String shoeName) {
        System.out.println();
        System.out.println("Sorry, we are all out of " + shoeName + ".");
        System.out.println("Please come again later.");
    }

    /**
     * Locates a shoe with a given name and returns it Id (index in the shoesInStock array)
     * @param shoeName The name of the shoe whose Id to find
     * @return The index of the shoe in the shoesInStock array
     */
    private static int findShoeIdBy(String shoeName) {
        // Write code here that returns the index of the shoe given above
        // to do that, simply write a loop that goes through shoesInStock 
        // array and compare each element with the shoeName parameter
        
        // If the shoe is found, return the index of the shoe; otherwise, return 
        // a negative number
    }

    /**
     * Recursively asks the buyer for a shoe name they want to purchase
     * @return The name of the shoe the buyer entered on the keyboard
     */
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

    /**
     * Prints a message that indicates the buyer has entered an invalid shoe name
     */
    private static void printShoeNameErrorMessage() {
        System.out.println();
        System.out.println("Please enter a valid shoe name.");
    }

    /**
     * Prints a message to welcome the buyer to our store
     */
    private static void printGreeting() {
        System.out.println("Hi, thank you for visiting us today.");
        System.out.println("We have all the latest in shoe designs.");
    }
}