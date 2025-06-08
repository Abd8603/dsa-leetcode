
public class BinarySearch {

    // Time Complexity: O(log n)
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            // If target is greater, ignore left half
            else if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        // Target was not found
        return -1;
    }
    
    // Main method to test the binary search implementation
    // The array must be sorted for binary search to work correctly
    public static void main(String[] args) {

        int[] numbers = {1,7,8,9,10,11,12,13,14,15};
        int target = 12;
        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
