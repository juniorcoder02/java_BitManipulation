public class PowerOfTwo {

    /**
     * Determines if a given integer `n` is a power of two.
     *
     * @param n The integer to check.
     * @return true if `n` is a power of two, false otherwise.
     */
    public static boolean isPowerOfTwo(int n) {
        // A number `n` is a power of two if it has only one set bit in its binary representation.
        // Using `n & (n - 1)` clears the lowest set bit. 
        // If `n` is a power of two, this operation results in 0.
        // Additionally, we need to check that `n` is positive.
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        // Test cases for the isPowerOfTwo function
        // 8 in binary is 1000, which is a power of two, so it should return true.
        System.out.println(isPowerOfTwo(8));  // Expected output: true

        // 9 in binary is 1001, which is not a power of two, so it should return false.
        System.out.println(isPowerOfTwo(9));  // Expected output: false
    }
}
