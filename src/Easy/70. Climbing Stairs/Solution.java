import java.util.HashMap;

class Solution {

    HashMap<Integer, Integer> StairLookup = new HashMap<Integer, Integer>();
    
    public int climbStairs(int n) {
        if (StairLookup.containsKey(n)) {
            return StairLookup.get(n);
        } else {
            StairLookup.put(n, n <= 1 ? 1 : climbStairs(n-1) + climbStairs(n-2));
            return StairLookup.get(n);
        }
    }
}