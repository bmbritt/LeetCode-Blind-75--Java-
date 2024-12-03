import java.util.HashMap;

/*
 * This solution runs in linear O(N) time
 * and makes use of a HashMap to avoid
 * the more common O(N^2) solution that 
 * evaluates every possible sum from the 
 * given array
 */



class Solution {
    public int[] twoSum(int[] nums, int target) {

        // v : i such that value v (key) is found at i index (value) of nums
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            int targetAddend = target - nums[i];

            if (map.containsKey(targetAddend)) {
                return new int[] {i, map.get(targetAddend)};
            } else {
                map.put(nums[i], i);
            }
        }
        //Given the problem parameters of exactly 1 solution, this should never happen.
        return null;
    }
}