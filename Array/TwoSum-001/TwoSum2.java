/*
 * Two Sum Problem : 001
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 */

import java.util.HashMap;
 
// This code is a placeholder for the TwoSum2 class, which is expected to implement a more efficient solution to the Two Sum problem.
public class TwoSum2 {
    
     public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++){
            if(mp.containsKey(nums[i])){
                return new int[]{mp.get(nums[i]),i};

            }else mp.put(target - nums[i], i);
        }
        return new int[]{0,0};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15,34, 9,56};
        
        int target = 9;
        int[] result = TwoSum2.twoSum(nums, target);
        
        // Print the result
        System.out.println("Indices of the two numbers that add up to " + target + ": [" + result[0] + ", " + result[1] + "]");
    }
}
