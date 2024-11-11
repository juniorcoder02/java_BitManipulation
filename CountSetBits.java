public class CountSetBits {

    /**
     * Counts the number of set bits (1s) in the binary representation of the integer `n`.
     *
     * @param n The integer whose set bits are to be counted.
     * @return The count of set bits in `n`.
     */
    public static int countSetBits(int n) {
        int count = 0; // Initialize count of set bits to 0

        // Loop until all bits in n are processed
        while (n > 0) {
            // Check if the least significant bit (LSB) of `n` is 1
            if ((n & 1) != 0) {
                count++; // Increment count if the LSB is 1
            }
            // Right shift `n` by 1 bit to check the next bit in the next iteration
            n = n >> 1;
        }
        return count; // Return the total count of set bits
    }

    public static void main(String[] args) {
        // Test the countSetBits function with a sample input (e.g., n = 10)
        // 10 in binary is 1010, which has 2 set bits.
        System.out.println(countSetBits(10)); // Output should be 2
    }
}
