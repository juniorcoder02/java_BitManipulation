public class MagicNumber {
    public static void main(String[] args) {
        int n = 6;
        int magicNumber = 0;
        int powerOfFive = 1; // start with 5^1
        while (n > 0) {
            // check for last bit is 1
            if ((n & 1) == 1) {
                magicNumber += powerOfFive;
            }
            // move to the next bit and next power of 5
            n = n >> 1;
            powerOfFive *= 5;
        }
        System.out.println("Magic Number: " + magicNumber);
    }
}
