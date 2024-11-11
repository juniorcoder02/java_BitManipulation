public class BiToDec {

    // Method to convert a binary number (given as an integer) to its decimal equivalent
    public static String binToDec(int n) {
        int decimalValue = 0; // Initialize result for decimal value
        int base = 1; // Binary place value (1, 2, 4, 8, ...)

        // Loop until the binary number is processed completely
        while (n > 0) {
            int lastDigit = n % 10; // Get the last digit (0 or 1)
            n = n / 10; // Remove the last digit from the number
            
            // Add the contribution of this binary digit to the decimal result
            decimalValue += lastDigit * base;
            
            base = base * 2; // Move to the next binary place (1 -> 2 -> 4 -> 8, etc.)
        }

        // Convert the result to a string and return it
        return String.valueOf(decimalValue);
    }

    public static void main(String[] args) {
        int num = 1010;
        String decimalResult = binToDec(num);
        System.out.println("Decimal value of binary " + num + " is: " + decimalResult);
    }
}
