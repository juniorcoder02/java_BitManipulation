public class LcmAndHcf {

    // Function to calculate GCD using the Euclidean algorithm
    public static int gcd(int a, int b) {
        // Using the Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b; // remainder
            a = temp;
        }
        return a;
    }

    // Function to calculate LCM using a brute-force approach
    public static int lcm(int a, int b) {
        int max = Math.max(a, b); // Start from the larger number

        // Loop until we find a common multiple of both numbers
        while (true) {
            if (max % a == 0 && max % b == 0) {
                return max; // If both numbers divide evenly, it's the LCM
            }
            max++; // Increment the max number and check again
        }
    }

    public static void main(String[] args) {
        int num1 = 12, num2 = 18;
        // calculate LCM
        int lcmResult = lcm(num1, num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcmResult);
        // Calculate GCD
        int hcf = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + hcf);
    }
}