/*
 * This solution runs in O(N) time and
 * with O(1) memory. It calculates the
 * sum of the range and nums independently
 * then takes their difference, revealing
 * the unmatched number.
 */

 class Solution {
    public int missingNumber(int[] nums) {
        
      int numsSum = 0;
      int rangeSum = 0;

      for (int i = 0; i < nums.length; i++) {
        numsSum += nums[i];
      }

      for (int i = 0; i <= nums.length; i++) {
        rangeSum += i;
      }

      return rangeSum - numsSum;
    }
}