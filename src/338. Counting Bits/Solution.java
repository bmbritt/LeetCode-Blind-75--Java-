class Solution {
    public int[] countBits(int n) {
        
        int[] result = new int[n+1];
        result[0] = 0;
        int offset = 1;

        for (int i = 1; i < result.length; i++) {

            if (offset * 2 == i) {
                offset *= 2;
            }
            
            result[i] = 1 + result[i - offset];
        }

        return result;
    }
}