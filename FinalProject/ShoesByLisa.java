import java.util.Scanner;

/**
 * ShoesByLisa
 */
public class ShoesByLisa {

    private static final String[] shoesInStock = {
        "Crocs", 
        "Air Force One", 
        "Eazies", 
        "McLaren's", 
        "Air Freeze",
        "Sketcher's Cloud",
        "Nothinhams"
    };

    private static final int[] shoesInStockQuantities = {
        23,
        18,
        2,
        15,
        4,
        9,
        0
    };

    public static void main(String[] args) {
        System.out.println();

        printGreeting();

        String buyerShoeRequest = getShoeRequest();        
        int shoeId = findShoeIdByShoeName(buyerShoeRequest);
        if(shoeId < 0) {
            printShoeOutOfStockMessage(buyerShoeRequest);
            return;
        }

        if(!isInStock(shoeId)) {
            printShoeOutOfStockMessage(buyerShoeRequest);
            return;
        }   
        
        int buyerShoeRequestQuantity = getShoeRequestQuantity(buyerShoeRequest);
        if(buyerShoeRequestQuantity < 1) {

        }
    }       
    
    private static int getShoeRequestQuantity(String shoeName) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many " + shoeName + "s would you like today: ");
        int shoesQuantity = keyboard.nextInt();
        keyboard.close();

        return shoesQuantity;
    }
    
    private static boolean isInStock(int shoeId) {
        return shoesInStockQuantities[shoeId] > 0;
    }
	
    private static void printShoeOutOfStockMessage(String shoeName) {
        System.out.println("Sorry, we are all out of " + shoeName + "'s");
    }

    private static int findShoeIdByShoeName(String shoeName) {

        for (int index = 0; index < shoesInStock.length; ++index) {
            if(shoesInStock[index].equalsIgnoreCase(shoeName)) {
                return index;
            }
        }

        return -1;
    }

    private static String getShoeRequest() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What shoe would you like today: ");
        String shoeRequest = keyboard.nextLine();
        keyboard.close();

        return shoeRequest;
    }

    private static void printGreeting() {
        System.out.println("Hi, thank you for visiting us today.");
        System.out.println("We have all the latest in shoe designs.");
    }
}