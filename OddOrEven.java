public class OddOrEven {
    // Approach:
    // We use the bitwise AND operator (&) to check the last (least significant) bit of the number.
    // In binary:
    // - Even numbers end in 0 (e.g., 2 is 10 in binary).
    // - Odd numbers end in 1 (e.g., 3 is 11 in binary).
    // By performing (n & 1), we can check if the last bit is 0 or 1:
    // - If (n & 1) == 0, the number is even.
    // - If (n & 1) == 1, the number is odd.

    public static void oddOrEven(int n) {
        int bitmask = 1; // Bitmask for checking the last bit (0001 in binary).
        
        // Perform bitwise AND operation between `n` and `bitmask`
        if ((n & bitmask) == 0) { // If result is 0, `n` is even
            System.out.println(n + " is an even number");
        } else { // If result is 1, `n` is odd
            System.out.println(n + " is an odd number");
        }
    }

    public static void main(String[] args) {
        // Test cases to check if the function correctly identifies odd or even numbers
        oddOrEven(3); // Expected output: "3 is an odd number"
        oddOrEven(8); // Expected output: "8 is an even number"
        oddOrEven(7); // Expected output: "7 is an odd number"
    }
}
