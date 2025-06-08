public class LinearSearch {
    
    // Time Complexity: O(n), where n is the length of the array
    // Returns the index of target if found, else -1
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Main method to test the linear search implementation
    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 1, 9, 3};
        int target = 7;
        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}