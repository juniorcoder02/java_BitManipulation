public class DecToBin {

    // Method to convert a decimal number (given as an integer) to its binary equivalent
    public static String decToBin(int n) {
        // Initialize a StringBuilder to store the binary result
        StringBuilder binaryResult = new StringBuilder();

        // Loop until the decimal number becomes 0
        while (n > 0) {
            int remainder = n % 2; // Get the remainder when dividing by 2 (0 or 1)
            binaryResult.append(remainder); // Append remainder to the result
            n = n / 2; // Update n by dividing it by 2 to move to the next higher binary place
        }

        // Reverse the result to get the correct binary order
        binaryResult.reverse();

        // Return the result as a string
        return binaryResult.toString();
    }

    public static void main(String[] args) {
        int num = 10;
        String binaryResult = decToBin(num);
        System.out.println("Binary value of decimal " + num + " is: " + binaryResult);
    }
}
