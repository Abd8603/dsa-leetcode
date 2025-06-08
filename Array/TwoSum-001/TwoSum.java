
/*
 * Two Sum Problem : 001
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */


public class TwoSum {

    // This method finds two indices in the array such that their corresponding values add up to the target value.
    // It uses a brute force approach with a time complexity of O(n^2).
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        // Iterate through the array to find the two numbers
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15,34, 9,56};
        
        int target = 9;
        int[] result = TwoSum.twoSum(nums, target);
        
        // Print the result
        System.out.println("Indices of the two numbers that add up to " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
    
}