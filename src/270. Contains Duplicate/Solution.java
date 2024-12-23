import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();


        for (int number : nums) {
            if (!set.add(number)) {
                return true;
            }
        }

        return false;
    }
}