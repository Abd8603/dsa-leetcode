
public class SelectionSort {
    // Selection Sort Algorithm
    // This class implements the selection sort algorithm to sort an array of integers.
    // Selection sort is an in-place comparison sorting algorithm.

    
    // Time Complexity: O(n^2), where n is the number of elements in the array
    // This method sorts the array in ascending order using selection sort algorithm
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            // Assume the minimum is the first element of the unsorted part
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                // Find the index of the minimum element in the unsorted part
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 90,56, 34, 78, 45,32, 21,45, 67, 89, 23};
        selectionSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
