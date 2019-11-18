/**
 * ForEachLoop
 */
public class ForEachLoop {

    public static void main(String[] args) {

        short[] dogTricks = {18, 8, 3, 22, 19, 8};
        
        for (short dogTick : dogTricks) {
            System.out.print(dogTick + " ");
        }

        System.out.println();
    }
}