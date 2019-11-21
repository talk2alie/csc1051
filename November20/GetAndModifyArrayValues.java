/**
 * GetAndModifyArrayValues
 */
public class GetAndModifyArrayValues {

    public static void main(String[] args) {
        // Values in an array are called elements or items of the array
        // You can retrieve an element by putting its index in the indexer
        // attached to the array variable's name
        // E.g. Take a look at the following array
        String[] bigBangTheoryCast = { "Penny", "Amy", "Bernadette", "Leonard", "Sheldon", "Howard", "Raj" };
        // Index of each element:         0       1         2            3          4         5        6

        // From the index above, if we want to get Sheldon, we write:
        // String sheldon = bigBangTheoryCast[4];
        // System.out.println(sheldon);

        // If we want to get Penny, we write:
        // String penny = bigBangTheoryCast[0];
        // System.out.println(penny);

        // If we want to get Leonard, we write: 
        // String leonard = bigBangTheoryCast[3];
        // System.out.println(leonard);

        // // Now you try! Write some statements to get the other cast members and print them
        //String bernadette = bigBangTheoryCast[2];
        //System.out.println(bigBangTheoryCast[2]);
        System.out.println(bigBangTheoryCast[4]);
        bigBangTheoryCast[4] = bigBangTheoryCast[4] + " Cooper";
        System.out.println(bigBangTheoryCast[4]);

        // // Modifying elements work the same way. 
        // // We use the indexer to get the position and then assign a new value to that position
        // // For example, we could add Sheldon's last name
        // // Before we do that, let's print the current value for Sheldon first
        // System.out.println("The current value at index 4 is: " + bigBangTheoryCast[4]); // Sheldon is at index 4. Note we are using the value directly

        // // Now let's modify Sheldon to add his last name
        // bigBangTheoryCast[4] = sheldon + " Cooper";

        // // Let's print Sheldon again using the same statement we used before
        // System.out.println("The current value at index 4 after changes is: " + bigBangTheoryCast[4]);

        // Now your turn, write a statement that adds Raj's last name. Hi last name is Koothrappali
    }
}