public class FastExponentiation {

    /**
     * Calculates a^n (a raised to the power n) using the fast exponentiation method.
     * This approach reduces the time complexity to O(log n) by utilizing bit manipulation.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a^n.
     */
    public static int fastExpo(int a, int n) {
        int ans = 1; // Initialize result as 1, since any number to the power 0 is 1

        // Loop until the exponent n becomes 0
        while (n > 0) {
            // If the current least significant bit (LSB) of n is 1,
            // multiply ans by a (equivalent to including this power of a in the result)
            if ((n & 1) != 0) {
                ans = ans * a;
            }

            // Square the base `a` to account for the next power of two in the exponent
            a = a * a;

            // Right shift `n` by 1 to move to the next higher power of two
            // (equivalent to dividing n by 2)
            n = n >> 1;
        }

        return ans; // Return the computed result of a^n
    }

    public static void main(String[] args) {
        // Test the fastExpo function with base 5 and exponent 3
        // Expected output: 125 (since 5^3 = 125)
        System.out.println(fastExpo(5, 3));
    }
}
