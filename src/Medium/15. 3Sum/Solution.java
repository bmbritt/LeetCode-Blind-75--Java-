import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2 && nums[i] <= 0; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            } else {
                int targetAddend = -nums[i];
                int leftPointer = i + 1;
                int rightPointer = nums.length - 1;
                while (leftPointer < rightPointer) {
                    if (leftPointer > i + 1 && nums[leftPointer] == nums[leftPointer - 1]) {
                        leftPointer++;
                        continue;
                    } else if (rightPointer < nums.length - 1 && nums[rightPointer] == nums[rightPointer + 1]) {
                        rightPointer--;
                        continue;
                    } else {
                        int addend = nums[leftPointer] + nums[rightPointer];
                        if (addend < targetAddend) {
                            leftPointer++;
                            continue;
                        } else if (addend > targetAddend) {
                            rightPointer--;
                            continue;
                        } else {
                            ArrayList<Integer> triplet = new ArrayList<Integer>();
                            triplet.add(nums[i]);
                            triplet.add(nums[leftPointer]);
                            triplet.add(nums[rightPointer]);
                            result.add(triplet);
                            leftPointer++;
                            rightPointer--;
                        }
                    }
                }
            }
        }
        return result;
    }
}