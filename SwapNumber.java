public class SwapNumber {
    // Function to swap two numbers without using a temporary variable
    public static void swap(int a, int b) {
        a = a ^ b; // swap two numbers using xor operation
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " + a + ", b = " + b); // Output: a = 8, b = 5
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        swap(a, b);

    }
}