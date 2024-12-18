class Solution {
    public int climbStairs(int n) {
        return n <= 1 ? 1 : climbStairs(n - 1) + climbStairs(n - 2);
    }
}