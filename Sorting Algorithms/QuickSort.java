// QuickSort.java
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 90, 56, 34, 78, 45, 32, 21, 45, 67, 89, 23};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

        /*QuickSort is a divide-and-conquer algorithm that sorts an array by partitioning it into smaller sub-arrays.
        The sub-arrays are then sorted recursively. The key operation is the partitioning step, which rearranges the elements
        in such a way that elements less than the pivot are on the left and elements greater than the pivot are on the right.
        The average time complexity of QuickSort is O(n log n), but in the worst case, 
        it can degrade to O(n^2) if the pivot is not chosen wisely.*/
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int pivotIndex = partition(arr, low, high);
            // Recursively sort the two halves
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method for QuickSort
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the rightmost element as pivot
        int i = low - 1; // Pointer for the smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partitioning index
    }
}
