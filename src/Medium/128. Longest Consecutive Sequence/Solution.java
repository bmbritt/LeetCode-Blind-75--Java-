import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashSet<Integer> set = new HashSet<Integer>();

        for (int number : nums) {
            set.add(number);
        }

        for (int member : set) {

            if (!set.contains(member - 1)) {
                int numConsecutive = 1;
                while (set.contains(member + 1)) {
                    numConsecutive++;
                    member++;
                }
                result = Math.max(result, numConsecutive);
            }
        }
        return result;
    }
}