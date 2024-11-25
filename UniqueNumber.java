public class UniqueNumber {
    public static int findUniqueNumber(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];
        }
        return result; // The unique number will be the one that appears once in the array.
                       // XOR operation with itself results in 0, and XOR operation with 0 results in
                       // the original number.
                       // Hence, the unique number is the XOR of all numbers in the array.
                       // This solution has a time complexity of O(n) and a space complexity of O(1).
                       // It also works for arrays with duplicates.
                       // Note: The numbers in the array must be positive integers.
                       // If negative numbers are allowed, the XOR operation will result in negative
                       // numbers, and we need to handle them accordingly.
                       // If the array is empty, the function will return 0.
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4, 1, 4, 3, 5, 5 };
        int uniqueNumber = findUniqueNumber(arr);
        System.out.println("The unique number is: " + uniqueNumber);
    }
}