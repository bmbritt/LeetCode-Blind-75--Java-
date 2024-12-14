class Solution {
    public int hammingWeight(int n) {
        int result = 0;
        while (n > 0) {
            n &= (n-1);
            result ++;
        }
        return result;
    }
}