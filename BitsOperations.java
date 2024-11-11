public class BitsOperations {

    // Method to get the i-th bit of a number
    public static int getIthBit(int n, int i) {
        // Concept:
        // Create a bit mask with `1` at the i-th position by shifting 1 left by `i`
        // bits.
        // Then use AND operation with `n`. If the result is 0, the i-th bit is 0;
        // otherwise, it's 1.

        int bitMask = 1 << i; // Shift 1 left by i positions

        // Perform AND operation to isolate the i-th bit
        if ((n & bitMask) == 0) {
            return 0; // i-th bit is 0
        }
        return 1; // i-th bit is 1
    }

    // Method to set the i-th bit of a number to 1
    public static int setIthBit(int n, int i) {
        // Concept:
        // Create a bit mask with `1` at the i-th position and OR it with `n`.
        // OR operation with `1` at i-th position will set that bit to 1, without
        // affecting other bits.

        int bitMask = 1 << i; // Shift 1 left by i positions to create bitmask

        return n | bitMask; // OR with n to set i-th bit to 1
    }

    // Method to clear the i-th bit of a number (set it to 0)
    public static int clearIthBit(int n, int i) {
        // Concept:
        // Create a bit mask with `0` at the i-th position (and `1`s elsewhere) by
        // shifting 1 left by `i` bits,
        // then taking the NOT (~) of it. AND operation with `n` will turn i-th bit to
        // 0.

        int bitMask = ~(1 << i); // Shift 1 left by i, then take NOT to get 0 at i-th position

        return n & bitMask; // AND with n to clear i-th bit to 0
    }

    // Method to update the i-th bit of a number with a new value (0 or 1)
    public static int updateIthBit(int n, int i, int newbit) {
        // Concept:
        // First clear the i-th bit by creating a bit mask with 0 at i-th position.
        // Then OR it with `newbit << i` to set the i-th bit to `newbit`.

        int bitMask = ~(1 << i); // Clear i-th bit with NOT-ed left-shifted 1

        return (n & bitMask) | (newbit << i); // Clear and then set with `newbit << i`
    }

    // Method to clear all bits from the 0th to i-th bit
    public static int clearIBits(int n, int i) {
        // Concept:
        // Create a bit mask that has 0s from 0 to i-th position and 1s elsewhere.
        // Shifting ~0 (all bits 1) left by i positions achieves this.

        int bitMask = (~0) << i; // Shift -1 (all 1s) left by i, making i right-most bits 0

        return n & bitMask; // AND with n to clear all bits from 0 to i
    }

    public static int clearBitsInRange(int n, int i, int j) {
        // Step 1: Create a mask to clear bits from index j onwards
        // (~0) is a sequence of all 1s in binary (e.g., ...11111111)
        // Left shift (~0) by (j + 1) to create a mask with all 1s up to position j (inclusive),
        // followed by 0s starting from j down to 0 (e.g., ...11110000 for j = 3).
        int a = (~0) << (j + 1);
    
        // Step 2: Create a mask to retain bits from 0 up to position i - 1
        // (1 << i) creates a binary number with only the i-th bit set (e.g., 00010000 for i = 4).
        // Subtracting 1 from this gives all 1s up to the (i - 1) position (e.g., 00001111).
        int b = (1 << i) - 1;
    
        // Step 3: Combine the two masks using the OR operator
        // This creates a mask with 1s in all positions except from i to j, where we have 0s.
        // For example, if i = 2 and j = 5, bitMask would be ...11100011.
        int bitMask = a | b;
    
        // Step 4: Apply the mask to `n` using the AND operator
        // The AND operation with bitMask clears bits from i to j in `n` while keeping other bits intact.
        return n & bitMask;
    }
    
    public static int toggleBit(int n,int i){
        // Toggle the i-th bit of a number
        // Concept:
        // Create a bit mask with `1` at the i-th position and XOR it with `n`.
        // XOR operation with `1` at i-th position will toggle that bit.

        int bitMask = 1 << i; // Shift 1 left by i positions

        return n ^ bitMask; // XOR with n to toggle i-th bit
    }

    public static void main(String[] args) {
        // Testing each method with example inputs
        System.out.println(getIthBit(4, 2)); // Expected output: 1 (4 in binary is 100, 2nd bit is 1)
        System.out.println(setIthBit(10, 2)); // Expected output: 14 (10 in binary is 1010, setting 2nd bit makes it
                                              // 1110 which is 14)
        System.out.println(clearIthBit(10, 1)); // Expected output: 8 (10 in binary is 1010, clearing 1st bit makes it
                                                // 1000 which is 8)
        System.out.println(updateIthBit(10, 2, 1)); // Expected output: 14 (update 2nd bit to 1 in 1010 makes it 1110
                                                    // which is 14)
        System.out.println(clearIBits(15, 2)); // Expected output: 12 (15 in binary is 1111, clearing 0 to 2nd bits
                                               // gives 1100 which is 12)
        System.out.println(clearBitsInRange(10, 2, 5)); 

        System.out.println(toggleBit(4, 2)); // Expected output: 5 (4 in binary is 100, 2nd bit is 1, after toggling it, it becomes 010 which is 5)
    }
}
