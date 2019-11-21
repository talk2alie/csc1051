/**
 * ListingArrayElements
 */
public class ListingArrayElements {

    public static void main(String[] args) {
        String[] bigBangTheoryCast = { "Penny", "Amy", "Bernadette", "Leonard", "Sheldon", "Howard", "Raj" };

        // 
        // for (int index = bigBangTheoryCast.length -1; index >= 0; index--) {
        //     System.out.println(bigBangTheoryCast[index]);
        // }

        for (String name : bigBangTheoryCast) {
            System.out.println(name);
        }
    }
}