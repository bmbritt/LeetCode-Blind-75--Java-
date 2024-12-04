/*
 * This solution runs in O(N) time and
 * with O(1) memory. It makes bitwise comparisons
 * between entries in range and the given numbers,
 * leaving behind the one number that has no match.
 */

class Solution {
    public int missingNumber(int[] nums) {
        
      int numsXOR = 0;
      int rangeXOR = 0;

      for (int i = 0; i < nums.length; i++) {
        numsXOR ^= nums[i];
      }

      for (int i = 0; i <= nums.length; i++) {
        rangeXOR ^= i;
      }

      return numsXOR ^ rangeXOR;
    }
}