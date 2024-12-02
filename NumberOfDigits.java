public class NumberOfDigits {
    public static int countDigits(int n) {
        int digits = (int) (Math.log10(n)) + 1;
        return digits;

    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Number of digits in " + n + " is: " + countDigits(n));
    }
}