/**
 * Write multiple add methods that know how to add bytes, shorts, ints, and longs
 */
public class MethodOverloadingExample {

    public static void main(String[] args) {
        
    }

    private static long addBytes(byte left, byte right) {
        return left + right;
    }

    private static long addBytes(short left, short right) {
        return left + right;
    }

    private static long addInts(int left, int right) {
        return left + right;
    }

    private static long addBytes(long left, long right) {
        return left + right;
    }
}