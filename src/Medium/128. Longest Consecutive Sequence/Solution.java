import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        int result = 0;
        HashSet<Integer> set = new HashSet<Integer>();

        for (int number : nums) {
            set.add(number);
        }

        for (int number : nums) {
            if (!set.contains(number-1)) {
                int element = number;
                int numConsecutive = 1;

                while (set.contains(element + 1)) {
                    set.remove(element);
                    numConsecutive++;
                    element++;
                }
                result = Math.max(result, numConsecutive);
            }
        }
        return result;
    }
}