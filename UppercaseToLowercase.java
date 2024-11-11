public class UppercaseToLowercase {
    public static void main(String[] args) {
        // Loop through each uppercase letter from 'A' to 'Z'
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            // Convert to lowercase by setting the 6th bit using bitwise OR with ' '
            char lowercaseChar = (char)(ch | ' ');
            // Print the lowercase version of the current character
            System.out.println(lowercaseChar);
        }
    }
}
